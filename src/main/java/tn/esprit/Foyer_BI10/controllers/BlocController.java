package tn.esprit.Foyer_BI10.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Foyer_BI10.entites.Bloc;
import tn.esprit.Foyer_BI10.services.IBlocService;
import tn.esprit.Foyer_BI10.services.IChambreService;

import java.util.List;
@Tag(name ="Gestion Bloc")

@RestController
@RequestMapping("/bloc")

public class BlocController {

        IBlocService blocService;



        @PostMapping("/addBloc")
        public Bloc addBloc(@RequestBody Bloc bloc) {
            return blocService.addBloc(bloc);
        }

        @GetMapping("/findAll")
        public List<Bloc> findAll() {
            return blocService.getAllBlocs();
        }

        @PutMapping("/modifierBloc")
        public Bloc modifierBloc(@RequestBody Bloc bloc) {
            return blocService.UpdateBloc(bloc);
        }

        @DeleteMapping("/deleteBloc/{idBloc}")
        public void deleteBloc(@PathVariable Long idBloc) {
            blocService.deleteBloc(idBloc);
        }
    }

