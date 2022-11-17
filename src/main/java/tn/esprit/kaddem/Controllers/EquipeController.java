package tn.esprit.kaddem.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddem.Entities.Equipe;
import tn.esprit.kaddem.Services.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Equipe")
public class EquipeController {
    IEquipeService iEquipeService;

    @GetMapping("/equipe")
    List<Equipe> retrieveAllEquipe(){
        return iEquipeService.retrieveAllEquipe();
    }
    @PostMapping("/equipe")
    Equipe addEquipe(@RequestBody Equipe E){
        return iEquipeService.addEquipe(E);
    }
    @DeleteMapping("/equipe/{idEquipe}")
    void deleteCEquipe(@PathVariable Long idEquipe){
        iEquipeService.deleteEquipe(idEquipe);
    }
    @PutMapping("/equipe")
    Equipe updateEquipe(@RequestBody Equipe E){
        return iEquipeService.updateEquipe(E);
    }
    @GetMapping("/equipe/{idEquipe}")
    Equipe retrieveEquipe(@RequestParam Long idEquipe) {
        return iEquipeService.retrieveEquipe(idEquipe);
    }
}
