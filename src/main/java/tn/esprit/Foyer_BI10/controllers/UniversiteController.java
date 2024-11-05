package tn.esprit.Foyer_BI10.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Foyer_BI10.entites.Universite;
import tn.esprit.Foyer_BI10.services.IUniversiteService;

import java.util.List;
@Tag(name ="Gestion Université")


@RestController
@RequestMapping("/universite")
public class UniversiteController {
   IUniversiteService universiteService;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @GetMapping("/findAll")
    public List<Universite> findAll() {
        return universiteService.getAllUniversites();
    }

    @PutMapping("/modifierUniversite")
    public Universite modifierUniversite(@RequestBody Universite universite) {
        return universiteService.UpdateUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite/{idUniversite}")
    public void deleteUniversite(@PathVariable Long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }
}
