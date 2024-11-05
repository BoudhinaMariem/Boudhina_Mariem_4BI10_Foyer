package tn.esprit.Foyer_BI10.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @ManyToOne
    @JsonIgnore
    private Bloc bloc;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC; // Ensure 'TypeChambre' is correctly defined elsewhere

    //
    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;
}
