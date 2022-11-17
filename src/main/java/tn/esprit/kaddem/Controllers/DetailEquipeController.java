package tn.esprit.kaddem.Controllers;


import tn.esprit.kaddem.Entities.DetailEquipe;
import tn.esprit.kaddem.Services.IDetailEquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("DetailEquipe")
public class DetailEquipeController {

    IDetailEquipeService iDetailEquipeService;

    @GetMapping("/afficherDEQ")
    List<DetailEquipe> retrieveAllDEquipeService()

    {
        return iDetailEquipeService.retrieveAllDEquipeService();
    }
    @PostMapping("/ajouterDEQ")
    DetailEquipe addDetailEquipe(DetailEquipe DE)
    {
        return iDetailEquipeService.addDetailEquipe(DE);
    }
    @DeleteMapping("/supprimerDEQ/{idDetailEquipe}")
    void deleteDetailEquipe(Long idDetailEquipe)
    {
        iDetailEquipeService.deleteDetailEquipe(idDetailEquipe);
    }
    @PutMapping("/modifierDEQ")
    DetailEquipe updateDetailEquipe(DetailEquipe DE)
    {
        return iDetailEquipeService.updateDetailEquipe(DE);
    }
    @GetMapping("/afficherDEQ/{idDetailEquipe}")
    DetailEquipe retrieveDetailEquipe (Long idDetailEquipe){
        return iDetailEquipeService.retrieveDetailEquipe(idDetailEquipe);
    }
}
