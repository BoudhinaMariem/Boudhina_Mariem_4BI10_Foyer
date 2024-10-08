package tn.esprit.foyer.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Universite;
import tn.esprit.foyer.services.IUniversiteService;

import java.util.List;

public class UniversiteController {
    IUniversiteService universiteService;
    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite b){
        return universiteService.addUniversite(b);
    }

    @GetMapping("/findAll")
    List<Universite> findAll(){
        return universiteService.getAllUniversite();
    }

    @DeleteMapping("/deleteUniversite/{idUniversite}")
    public void deleteUniversite(@PathVariable("idUniversite") Long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }
    @PutMapping("/updateUniversite")
    public Universite UpdateUniversite(@RequestBody Universite b) {
        return universiteService.UpdateUniversite(b);
    }
}
