package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.repositories.ChambreRepository;

import java.util.List;

@FieldDefaults(level = AccessLevel.PUBLIC)
@Service
@AllArgsConstructor

public class ChambreServiceImpl implements IChambreService {
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre UpdateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }
}
