package tn.esprit.Foyer_BI10.services;

import tn.esprit.Foyer_BI10.entites.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    public Reservation addReservation (Reservation reservation);
    public void deleteReservation(String idReservation);
    public Reservation UpdateReservation(Reservation reservation);
    public  List<Reservation> getAllReservations();
    List<Reservation> findByAnneeUniversitaireBetween(Date d1, Date d2);

    public Reservation ajouterReservationAvecEtudiants ( Reservation reservation);


}
