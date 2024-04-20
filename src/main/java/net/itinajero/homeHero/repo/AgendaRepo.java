package net.itinajero.homeHero.repo;

import net.itinajero.homeHero.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgendaRepo extends JpaRepository<Agenda, Long>, QueryByExampleExecutor<Agenda>, JpaSpecificationExecutor<Agenda> {
    @Query("SELECT a FROM Agenda a WHERE a.id_user = :idUser ORDER BY a.fecha_cita DESC")
    List<Agenda> findByIdUser( Long idUser);

    @Query("SELECT a FROM Agenda a WHERE a.id_homehero = :idHomehero ORDER BY a.fecha_cita DESC")
    List<Agenda> findByIdHomehero( Long idHomehero);

}