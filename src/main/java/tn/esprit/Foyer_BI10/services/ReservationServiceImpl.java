package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Reservation;
import tn.esprit.Foyer_BI10.repositories.ReservationRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public List<Reservation> findByAnneeUniversitaireBetween(Date d1, Date d2) {
        return reservationRepository.findByAnneeUniversitaireBetween(d1, d2);
    }
}
