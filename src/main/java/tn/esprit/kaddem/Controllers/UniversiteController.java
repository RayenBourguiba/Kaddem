package tn.esprit.kaddem.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddem.Entities.Universite;
import tn.esprit.kaddem.Services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Universite")
public class UniversiteController {
    IUniversiteService iUniversiteService;

    @GetMapping("/afficheruniversite")
    List<Universite> retrieveAllUniversite(){
        return iUniversiteService.retrieveAllUniversite();
    }
    @PostMapping("/ajouteruniversite")
    Universite addUniversite(@RequestBody Universite U){
        return iUniversiteService.addUniversite(U);
    }
    @DeleteMapping("/supprimeruniversite/{idUniv}")
    void deleteUniversite(@PathVariable Long idUniv){
        iUniversiteService.deleteUniversite(idUniv);
    }
    @PutMapping("/modifieruniversite")
    Universite updateUniversite(@RequestBody Universite U){
        return iUniversiteService.updateUniversite(U);
    }
    @GetMapping("/afficherunoversite/{idUniv}")
    Universite retrieveUniversite(@PathVariable Long idUniv){
        return iUniversiteService.retrieveUniversite(idUniv);
    }
}
