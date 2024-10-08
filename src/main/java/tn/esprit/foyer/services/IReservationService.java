package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer.entities.Reservation;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)

public interface IReservationService {
    public Reservation addReservation (Reservation reservation);
    public void deleteReservation (String idReservation);
    public Reservation  UpdateReservation (Reservation reservation);
    public List<Reservation> getAllReservation ();
}
