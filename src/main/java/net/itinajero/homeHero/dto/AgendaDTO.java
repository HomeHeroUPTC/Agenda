package net.itinajero.homeHero.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaDTO {
    private Long id_agenda;
    private Long id_user;
    private Long id_homehero;
    private Long id_cita;
    private LocalDateTime fecha_cita;
    private String descripcion_cita;
    private String direccion_cita;
    private Character estado;
    private Character tipo_cita;
}
