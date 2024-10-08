package tn.esprit.foyer.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.services.IBlocService;

import java.util.List;

public class BlocController {
    IBlocService blocService;
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc b){
        return blocService.addBloc(b);
    }

    @GetMapping("/findAll")
    List<Bloc> findAll(){
        return blocService.getAllBloc();
    }

    @DeleteMapping("/deleteBloc/{idBloc}")
    public void deleteBloc(@PathVariable("idBloc") Long idBloc) {
        blocService.deleteBloc(idBloc);
    }
    @PutMapping("/updateBloc")
    public Bloc UpdateBloc(@RequestBody Bloc b) {
        return blocService.UpdateBloc(b);
    }
}
