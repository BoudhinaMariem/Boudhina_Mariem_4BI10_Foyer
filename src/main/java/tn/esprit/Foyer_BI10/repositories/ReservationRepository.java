package tn.esprit.Foyer_BI10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Foyer_BI10.entites.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation,String> {

    List<Reservation> findByAnneeUniversitaireBetween(Date d1, Date d2);
}
