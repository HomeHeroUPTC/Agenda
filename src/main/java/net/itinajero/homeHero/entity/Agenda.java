package net.itinajero.homeHero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
