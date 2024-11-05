package tn.esprit.Foyer_BI10.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Foyer_BI10.entites.Etudiant;
import tn.esprit.Foyer_BI10.services.IEtudiantService;

import java.util.List;

@Tag(name ="Gestion Etudiant")

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("/findAll")
    public List<Etudiant> findAll() {
        return etudiantService.getAllEtudiants();
    }

    @PutMapping("/modifierEtudiant")
    public Etudiant modifierEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.UpdateEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    public void deleteEtudiant(@PathVariable Long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }
}
