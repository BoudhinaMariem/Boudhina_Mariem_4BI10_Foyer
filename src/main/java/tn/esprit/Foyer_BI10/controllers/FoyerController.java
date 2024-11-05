package tn.esprit.Foyer_BI10.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Foyer_BI10.entites.Foyer;
import tn.esprit.Foyer_BI10.services.IFoyerService;

import java.util.List;
@Tag(name ="Gestion Foyer")


@RestController
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @GetMapping("/findAll")
    public List<Foyer> findAll() {
        return foyerService.getAllFoyers();
    }

    @PutMapping("/modifierFoyer")
    public Foyer modifierFoyer(@RequestBody Foyer foyer) {
        return foyerService.UpdateFoyer(foyer);
    }

    @DeleteMapping("/deleteFoyer/{idFoyer}")
    public void deleteFoyer(@PathVariable Long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }
}
