package tn.esprit.kaddem.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddem.Entities.Etudiant;
import tn.esprit.kaddem.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Etudiant")
public class EtudiantController {
    IEtudiantService iEtudiantService;
    @GetMapping("/afficheretudiant")
    List<Etudiant> retrieveAllEtudiant(){
        return iEtudiantService.retrieveAllEtudiant();
    }
    @PostMapping("/ajouteretudiant")
    Etudiant addEtudiant(@RequestBody Etudiant Et){
        return iEtudiantService.addEtudiant(Et);
    }
    @DeleteMapping("/supprimerEtudiant/{idEtudiant}")
    void deleteEtudiant( @PathVariable Long idEtudiant){
        iEtudiantService.deleteEtudiant(idEtudiant);
    }
    @PutMapping("/modifierEtudinat")
    Etudiant updateEtudiant(@RequestBody Etudiant Et){
        return iEtudiantService.updateEtudiant(Et);
    }
    @GetMapping("/afficheretudiant/{idEtudiant}")
    Etudiant retrieveEtudiant(@PathVariable Long idEtudiant)
    {
        return iEtudiantService.retrieveEtudiant(idEtudiant);
    }
}