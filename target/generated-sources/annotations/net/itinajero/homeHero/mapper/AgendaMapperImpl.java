package net.itinajero.homeHero.mapper;

import javax.annotation.processing.Generated;
import net.itinajero.homeHero.dto.AgendaDTO;
import net.itinajero.homeHero.entity.Agenda;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-19T16:05:18-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class AgendaMapperImpl implements AgendaMapper {

    @Override
    public Agenda mapAgendaDTOToAgenda(AgendaDTO agendaDTO) {
        if ( agendaDTO == null ) {
            return null;
        }

        Agenda agenda = new Agenda();

        agenda.setId_agenda( agendaDTO.getId_agenda() );
        agenda.setId_user( agendaDTO.getId_user() );
        agenda.setId_homehero( agendaDTO.getId_homehero() );
        agenda.setId_cita( agendaDTO.getId_cita() );
        agenda.setFecha_cita( agendaDTO.getFecha_cita() );
        agenda.setDescripcion_cita( agendaDTO.getDescripcion_cita() );
        agenda.setDireccion_cita( agendaDTO.getDireccion_cita() );
        agenda.setEstado( agendaDTO.getEstado() );
        agenda.setTipo_cita( agendaDTO.getTipo_cita() );

        return agenda;
    }

    @Override
    public AgendaDTO mapAgendaToAgendaDTO(Agenda agenda) {
        if ( agenda == null ) {
            return null;
        }

        AgendaDTO agendaDTO = new AgendaDTO();

        agendaDTO.setId_agenda( agenda.getId_agenda() );
        agendaDTO.setId_user( agenda.getId_user() );
        agendaDTO.setId_homehero( agenda.getId_homehero() );
        agendaDTO.setId_cita( agenda.getId_cita() );
        agendaDTO.setFecha_cita( agenda.getFecha_cita() );
        agendaDTO.setDescripcion_cita( agenda.getDescripcion_cita() );
        agendaDTO.setDireccion_cita( agenda.getDireccion_cita() );
        agendaDTO.setEstado( agenda.getEstado() );
        agendaDTO.setTipo_cita( agenda.getTipo_cita() );

        return agendaDTO;
    }
}
