package tn.esprit.Foyer_BI10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.entites.TypeChambre;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

        List<Chambre> findByTypeC(TypeChambre tc); // Updated method name

        Optional<Chambre> findById(Long idChambre);

        Chambre findByNumeroChambre(Long numeroChambre); // This is fine

        List<Chambre> findByBlocIdBlocAndTypeC(Long idBloc, TypeChambre typeC);

        List<Chambre> findByBloc_NomBloc(String nomBloc);
        Integer countByBloc_CapaciteBlocGreaterThan(Long capacite);

        @Query("SELECT c FROM Chambre c WHERE c.bloc.nomBloc = :nomBloc")
        List<Chambre> findByBlocNameQuery(String nomBloc);

        @Query("SELECT c FROM Chambre c JOIN c.reservations r WHERE r.anneeUniversitaire BETWEEN :startDate AND :endDate")
        List<Chambre> findByAnneeDeQuery(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
