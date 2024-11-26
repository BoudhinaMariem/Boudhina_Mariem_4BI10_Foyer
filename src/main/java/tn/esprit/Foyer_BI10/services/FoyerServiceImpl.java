package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Foyer;
import tn.esprit.Foyer_BI10.repositories.FoyerRepository;

import java.util.List;

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
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer ajouterFoyerAvecBlocsAssociés(Foyer foyer) {
        if (foyer.bloc != null) {
            foyer.bloc.forEach(bloc -> bloc.foyer = foyer);
        }
        return foyerRepository.save(foyer);
    }


}
