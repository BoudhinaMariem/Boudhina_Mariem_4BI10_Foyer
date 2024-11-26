package tn.esprit.Foyer_BI10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Foyer_BI10.entites.Foyer;

import java.util.Optional;

@Repository
public interface FoyerRepository extends JpaRepository <Foyer,Long> {
    Optional<Foyer> findById(Long idFoyer);
}
