package tn.esprit.Foyer_BI10.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @ManyToMany(mappedBy = "resrvations")
    private List<Etudiant> etudiants;
    @Id
    private String idReservation;
    private Date anneeUniversitaire;

    private Boolean  estValid;

    @ManyToOne
    private Chambre chambre;


}
