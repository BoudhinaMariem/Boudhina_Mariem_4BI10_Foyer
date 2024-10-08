package tn.esprit.foyer.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Reservation;
import tn.esprit.foyer.services.IReservationService;

import java.util.List;

public class ReservationController {
    IReservationService reservationService;
    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation r){
        return reservationService.addReservation(r);
    }

    @GetMapping("/findAll")
    List<Reservation> findAll(){
        return reservationService.getAllReservation();
    }

    @DeleteMapping("/deleteReservation/{idReservation}")
    public void deleteReservation(@PathVariable("idReservation") String idReservation) {
        reservationService.deleteReservation(idReservation);
    }
    @PutMapping("/updateReservation")
    public Reservation UpdateReservation(@RequestBody Reservation r) {
        return reservationService.UpdateReservation(r);
    }
}
