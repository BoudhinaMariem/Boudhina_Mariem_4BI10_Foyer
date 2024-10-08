package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.repositories.BlocRepository;

import java.util.List;
@FieldDefaults(level = AccessLevel.PUBLIC)
@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{
    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteCBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc UpdateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }
}
