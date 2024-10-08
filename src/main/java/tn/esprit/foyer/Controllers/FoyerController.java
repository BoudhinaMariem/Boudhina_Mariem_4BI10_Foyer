package tn.esprit.foyer.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.services.IFoyerService;

import java.util.List;

public class FoyerController {
    IFoyerService foyerService;
    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer f){
        return foyerService.addFoyer(f);
    }

    @GetMapping("/findAll")
    List<Foyer> findAll(){
        return foyerService.getAllFoyer();
    }

    @DeleteMapping("/deleteFoyer/{idFoyer}")
    public void deleteFoyer(@PathVariable("idFoyer") Long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }
    @PutMapping("/updateFoyer")
    public Foyer UpdateFoyer(@RequestBody Foyer f) {
        return foyerService.UpdateFoyer(f);
    }
}
