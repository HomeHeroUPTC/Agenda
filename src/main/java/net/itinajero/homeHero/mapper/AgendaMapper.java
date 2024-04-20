package net.itinajero.homeHero.mapper;

import net.itinajero.homeHero.dto.AgendaDTO;
import net.itinajero.homeHero.entity.Agenda;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AgendaMapper {
    AgendaMapper INSTANCE = Mappers.getMapper(AgendaMapper.class);

    Agenda mapAgendaDTOToAgenda(AgendaDTO agendaDTO);

    AgendaDTO mapAgendaToAgendaDTO(Agenda agenda);

}
