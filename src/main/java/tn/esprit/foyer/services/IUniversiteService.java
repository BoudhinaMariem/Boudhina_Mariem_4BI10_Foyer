package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer.entities.Universite;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)

public interface IUniversiteService {
    public Universite addUniversite (Universite universite);
    public void deleteUniversite (Long idUniversite);
    public Universite UpdateUniversite (Universite universite);
    public List<Universite> getAllUniversite ();
}
