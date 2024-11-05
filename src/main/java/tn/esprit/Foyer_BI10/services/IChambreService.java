package tn.esprit.Foyer_BI10.services;

import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.entites.TypeChambre;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IChambreService {
     public Chambre addChambre (Chambre chambre);
     public void deleteChambre (Long idChambre);
     public Chambre UpdateChambre(Chambre chambre);
     public List<Chambre> getAllChambres();
     Chambre getChambreByID(Long id);

     List<Chambre> findByTypeC(TypeChambre tc);
     Chambre findNumeroChambre(Long numeroChambre);
     List<Chambre> getChambreParBlocType(Long idBloc, TypeChambre typec);

     List<Chambre> findChambresByBlocNom(String nomBloc);
     Integer countChambresByBlocCapaciteGreaterThan(Long capacite);
     List<Chambre> findByBlocName(String nomBloc);
     List<Chambre> findByAnneeDe(Date startDate, Date endDate);
}
