package tn.esprit.Foyer_BI10.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.entites.TypeChambre;
import tn.esprit.Foyer_BI10.services.IChambreService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Tag(name ="Gestion Chambre")
@RestController
@RequestMapping("/chambre")
public class ChambreController {
    public ChambreController(IChambreService chambreService) {
        this.chambreService = chambreService;
    }
    IChambreService chambreService;
    @Operation(description = "recuperer toutes les chambre de la base de donnés")
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }
    @GetMapping("/findAll")
    List<Chambre> findAll(){
       return chambreService.getAllChambres();
    }
    @PutMapping("/modifierchambre")
    Chambre modifierChambre(@RequestBody Chambre c){
        Chambre chambre = chambreService.UpdateChambre(c);
        return chambre;
    }
    @DeleteMapping("/deletechambre")
    void deleteChambre(@PathVariable Chambre c){
        chambreService.deleteChambre(c.getIdChambre());
    }
    @DeleteMapping("/deleteChambre/{idChambre}")
    public void deleteChambre(@PathVariable("idChambre") Long idChambre) {
        chambreService.deleteChambre(idChambre);
    }
    @GetMapping("/findbyid/{idChambre}")
    public ResponseEntity<Chambre> findById(@PathVariable Long idChambre) {
        Chambre chambre = chambreService.getChambreByID(idChambre);
        return chambre != null ? ResponseEntity.ok(chambre) : ResponseEntity.notFound().build();
    }
    @GetMapping("/findbytype/{typeChambre}")
    public ResponseEntity<List<Chambre>> findByTypeChambre(@PathVariable TypeChambre typeChambre) {
        List<Chambre> chambres = chambreService.findByTypeC(typeChambre);
        return chambres.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(chambres);
    }

    // Get a chambre by its number
    @GetMapping("/findnumer/{numeroChambre}")
    public ResponseEntity<Chambre> findByNumeroChambre(@PathVariable Long numeroChambre) {
        Chambre chambre = chambreService.findNumeroChambre(numeroChambre);
        return chambre != null ? ResponseEntity.ok(chambre) : ResponseEntity.notFound().build();
    }

    // Get chambres by block and type
    @GetMapping("/findbyblocandtype")
    public ResponseEntity<List<Chambre>> getChambresParBlocType(
            @RequestParam Long idBloc,
            @RequestParam TypeChambre typeChambre) {
        List<Chambre> chambres = chambreService.getChambreParBlocType(idBloc, typeChambre);
        return chambres.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(chambres);
    }

    @GetMapping("/findByBlocNom")
    public List<Chambre> findChambresByBlocNom(@RequestParam String nomBloc) {
        return chambreService.findChambresByBlocNom(nomBloc);
    }

    @GetMapping("/countCapacite")
    public Integer countChambresByBlocCapacite(@RequestParam Long capacite) {
        return chambreService.countChambresByBlocCapaciteGreaterThan(capacite);
    }

    @GetMapping("/by-bloc/{nomBloc}")
    public List<Chambre> getChambresByBloc(@PathVariable String nomBloc) {
        return chambreService.findByBlocName(nomBloc);
    }

    @GetMapping("/by-annee")
    public List<Chambre> getChambresByAnnee(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        return chambreService.findByAnneeDe(startDate, endDate);
    }
}
