package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.repositories.FoyerRepository;

import java.util.List;

@FieldDefaults(level = AccessLevel.PUBLIC)
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{
    FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer UpdateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }
}
