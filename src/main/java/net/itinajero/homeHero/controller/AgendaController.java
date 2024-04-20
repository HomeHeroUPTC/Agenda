package net.itinajero.homeHero.controller;

import net.itinajero.homeHero.dto.AgendaDTO;
import net.itinajero.homeHero.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
	@Autowired
	AgendaService agendaService;
	@GetMapping("/fetchAllAgendas")
	public ResponseEntity<List<AgendaDTO>> fetchAllAgendas(){
		List<AgendaDTO> agendas = agendaService.findAllAgendas();
		return new ResponseEntity<>(agendas, HttpStatus.OK);
	}

	@PostMapping("/addAgenda")
	public  ResponseEntity<AgendaDTO> saveAgenda(@RequestBody AgendaDTO agendaDTO){
		System.out.println(agendaDTO);
		AgendaDTO agendaAdded = agendaService.addAgendaInDB(agendaDTO);
		return new ResponseEntity<>(agendaAdded,HttpStatus.CREATED);
	}
	@GetMapping("/fetchAgendaById/{id}")
	public ResponseEntity<AgendaDTO> findAgendaById(@PathVariable Long id){
		return agendaService.fetchAgendaById(id);
	}

	@PostMapping("/updateAgenda/{id}")
	public ResponseEntity<AgendaDTO> updateAgenda(@PathVariable Long id, @RequestBody AgendaDTO agendaDTO){
		return agendaService.updateAgendaInDB(id, agendaDTO);
	}

	@GetMapping("/getListUsersAgenda/{idUser}")
	public ResponseEntity<List<AgendaDTO>> listAgendaUsers(@PathVariable Long idUser){
		List<AgendaDTO> agenda = agendaService.getAgendaByidUser(idUser);
		return  new ResponseEntity<>(agenda,HttpStatus.OK);
	}

	@GetMapping("/getListHomeHeroAgenda/{idHomeHero}")
	public ResponseEntity<List<AgendaDTO>> listAgendaHomeHero(@PathVariable Long idHomeHero){
		List<AgendaDTO> agenda = agendaService.getAgendaByidHomeHEro(idHomeHero);
		return  new ResponseEntity<>(agenda,HttpStatus.OK);
	}
}
