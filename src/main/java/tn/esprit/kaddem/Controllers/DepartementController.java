package tn.esprit.kaddem.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddem.Entities.Departement;
import tn.esprit.kaddem.Services.IDepartementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Departement")
public class DepartementController {
    IDepartementService iDepartementService;

    @GetMapping("/afficherDepartement")
    List<Departement> retrieveAllDepartement(){
        return   iDepartementService.retrieveAllDepartement();
    }
    @PostMapping("/ajouterDepartement")
    Departement addDepartement(@RequestBody Departement D){
        return iDepartementService.addDepartement(D);
    }

    @DeleteMapping("supprimerDepartement/{idDepart}")
    void deleteDepartement(@PathVariable Long idDepart){
        iDepartementService.deleteDepartement(idDepart);
    }

    @PutMapping("/ModifierDepartement")
    Departement updateDepartement(@RequestBody  Departement D){
        return iDepartementService.updateDepartement(D);
    }

    @GetMapping("/afficherDepartement/{idDepart}")
    Departement retrieveDepartement(@PathVariable Long idDepart){
        return iDepartementService.retrieveDepartement(idDepart);
    }
}
