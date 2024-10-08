package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Universite;
import tn.esprit.foyer.repositories.UniversiteRepository;

import java.util.List;

@FieldDefaults(level = AccessLevel.PUBLIC)
@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite UpdateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }
}
