package tn.esprit.Foyer_BI10.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.Foyer_BI10.entites.Universite;

import java.util.List;

public interface IUniversiteService {
   public Universite addUniversite (Universite universite);
    public void deleteUniversite(Long idUniversite);
    public Universite UpdateUniversite(Universite universite);
    public List<Universite> getAllUniversites();

    Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);
    Universite desaffecterFoyerAUniversite(long idUniversite);
}
