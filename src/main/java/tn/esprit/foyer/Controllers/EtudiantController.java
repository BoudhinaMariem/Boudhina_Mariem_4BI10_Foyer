package tn.esprit.foyer.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.services.IEtudiantService;

import java.util.List;

public class EtudiantController {
    IEtudiantService etudiantService;
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }

    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return etudiantService.getAllEtudiant();
    }

    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    public void deleteEtudiant(@PathVariable("idEtudiant") Long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }
    @PutMapping("/updateEtudiant")
    public Etudiant UpdateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.UpdateEtudiant(e);
    }
}
