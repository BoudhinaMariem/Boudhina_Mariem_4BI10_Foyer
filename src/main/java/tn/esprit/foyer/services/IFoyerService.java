package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer.entities.Foyer;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)

public interface IFoyerService {
    public Foyer addFoyer (Foyer foyer);
    public void deleteFoyer (Long idFoyer);
    public Foyer UpdateFoyer (Foyer foyer);
    public List<Foyer> getAllFoyer ();
}
