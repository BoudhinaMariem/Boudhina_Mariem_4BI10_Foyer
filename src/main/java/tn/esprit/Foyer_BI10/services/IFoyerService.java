package tn.esprit.Foyer_BI10.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.Foyer_BI10.entites.Foyer;

import java.util.List;

public interface IFoyerService {
    public Foyer addFoyer (Foyer foyer);
    public void deleteFoyer (Long idFoyer);
    public Foyer UpdateFoyer(Foyer foyer);
    public List<Foyer> getAllFoyers();

    Foyer ajouterFoyerAvecBlocsAssociés(Foyer foyer);
}
