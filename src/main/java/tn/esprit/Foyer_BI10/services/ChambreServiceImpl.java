package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Bloc;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.entites.TypeChambre;
import tn.esprit.Foyer_BI10.repositories.BlocRepository;
import tn.esprit.Foyer_BI10.repositories.ChambreRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre UpdateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getChambreByID(Long id) {
        return chambreRepository.findById(id).orElse(null); // Return null if not found
    }
    @Override
    public List<Chambre> findByTypeC(TypeChambre typeC) {
        return chambreRepository.findByTypeC(typeC); // Assuming this is the method for type search
    }

    @Override
    public Chambre findNumeroChambre(Long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> getChambreParBlocType(Long idBloc, TypeChambre typeC) {
        return chambreRepository.findByBlocIdBlocAndTypeC(idBloc, typeC);
    }

    @Override
    public List<Chambre> findChambresByBlocNom(String nomBloc) {
        return chambreRepository.findByBloc_NomBloc(nomBloc);
    }

    @Override
    public Integer countChambresByBlocCapaciteGreaterThan(Long capacite) {
        return chambreRepository.countByBloc_CapaciteBlocGreaterThan(capacite);
    }

    @Override
    public List<Chambre> findByBlocName(String nomBloc) {
        return chambreRepository.findByBlocNameQuery(nomBloc);
    }

    @Override
    public List<Chambre> findByAnneeDe(Date startDate, Date endDate) {
        return chambreRepository.findByAnneeDeQuery(startDate, endDate);
    }



    private BlocRepository blocRepository;

    @Override
    public Chambre affecterChambreABloc(Long num, Long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        Chambre chambre = chambreRepository.findById(num).get();

        if (bloc != null && chambre != null) {
            chambre.setBloc(bloc);
            return chambreRepository.save(chambre);
        }
        return null;
    }

    @Override
    public void desaffecterChambreDeBloc(Long num, Long idBloc) {
        Chambre chambre = chambreRepository.findById(num).get();

        if (chambre != null && chambre.getBloc() != null && chambre.getBloc().getIdBloc().equals(idBloc)) {
            chambre.setBloc(null);
            chambreRepository.save(chambre);
        }
    }

    @Scheduled(fixedDelay = 60000)
    public void fixedDelayMethod(){
        log.info("Method with fixed delay");
    }



}
