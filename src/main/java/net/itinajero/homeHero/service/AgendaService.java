package net.itinajero.homeHero.service;

import net.itinajero.homeHero.dto.AgendaDTO;
import net.itinajero.homeHero.entity.Agenda;
import net.itinajero.homeHero.mapper.AgendaMapper;
import net.itinajero.homeHero.repo.AgendaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static net.itinajero.homeHero.mapper.AgendaMapper.*;
import static net.itinajero.homeHero.mapper.AgendaMapper.INSTANCE;

@Service
public class AgendaService {
    @Autowired
    AgendaRepo agendaRepo;

    public List<AgendaDTO> findAllAgendas(){
        List<Agenda> agendas = agendaRepo.findAll();
        return agendas.stream().map(INSTANCE::mapAgendaToAgendaDTO).collect(Collectors.toList());
    }

    public AgendaDTO addAgendaInDB(AgendaDTO agendaDTO) {
        Agenda agenda = INSTANCE.mapAgendaDTOToAgenda(agendaDTO);
        Agenda savedAgenda = agendaRepo.save(agenda);
        return INSTANCE.mapAgendaToAgendaDTO(savedAgenda);
    }

    public ResponseEntity<AgendaDTO> fetchAgendaById(Long id){
        Optional<Agenda> agenda = agendaRepo.findById(id);
        if(agenda.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(INSTANCE.mapAgendaToAgendaDTO(agenda.get()),HttpStatus.OK);
    }

    public ResponseEntity<AgendaDTO> updateAgendaInDB(Long id, AgendaDTO agendaDTO) {
        Optional<Agenda> agendaOriginal = agendaRepo.findById(id);
        if (agendaOriginal.isPresent()){
            Agenda agenda = INSTANCE.mapAgendaDTOToAgenda(agendaDTO);
            Agenda savedAgenda = agendaRepo.save(agenda);
            return new ResponseEntity<>(INSTANCE.mapAgendaToAgendaDTO(savedAgenda), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }

    public  List<AgendaDTO> getAgendaByidUser(Long idUser){
        List<Agenda> userlist = agendaRepo.findByIdUser(idUser);
        return userlist.stream().map(INSTANCE::mapAgendaToAgendaDTO).collect(Collectors.toList());
    }

    public  List<AgendaDTO> getAgendaByidHomeHEro(Long idHomeHero){
        List<Agenda> userlist = agendaRepo.findByIdHomehero(idHomeHero);
        return userlist.stream().map(INSTANCE::mapAgendaToAgendaDTO).collect(Collectors.toList());
    }

}
