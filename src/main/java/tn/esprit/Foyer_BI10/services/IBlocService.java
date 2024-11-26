package tn.esprit.Foyer_BI10.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.Foyer_BI10.entites.Bloc;
import tn.esprit.Foyer_BI10.entites.Chambre;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc (Bloc bloc);
    public void deleteBloc (Long idBloc);
    public Bloc UpdateBloc(Bloc bloc);
    public List<Bloc> getAllBlocs();

    Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);
}
