package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer.entities.Bloc;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)

public interface IBlocService {
    public Bloc addBloc (Bloc bloc);
    public void deleteBloc (Long idBloc);
    public Bloc UpdateBloc (Bloc bloc);
    public List<Bloc> getAllBloc ();
}
