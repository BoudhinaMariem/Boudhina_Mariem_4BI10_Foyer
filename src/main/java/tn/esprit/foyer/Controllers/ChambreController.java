package tn.esprit.foyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
//injection de dependance M1: @Autowired M2:@AllArgsConstructor
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){

        return chambreService.addChambre(c);
    }

    @GetMapping("/findAll")
    List<Chambre> findAll(){
        return chambreService.getAllChambre();
    }

    @DeleteMapping("/deleteChambre/{idChambre}")
    public void deleteChambre(@PathVariable("idChambre") Long idChambre) {
        chambreService.deleteChambre(idChambre);
    }
    @PutMapping("/updateChambre")
    public Chambre UpdateChambre(@RequestBody Chambre c) {
        return chambreService.UpdateChambre(c);
    }
}
