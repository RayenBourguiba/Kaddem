package tn.esprit.kaddem.Controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.esprit.kaddem.Entities.Contrat;
import tn.esprit.kaddem.Services.IContratService;

import java.util.List;


@RestController
@Tag(name="compte")
@AllArgsConstructor
@RequestMapping("Contrat")
public class ContratController {
    IContratService iContratService;

    @PostMapping("/ajouterContrat")
    Contrat addContrat(@RequestBody Contrat C){
        return   iContratService.addContrat(C);
    }

    @PutMapping("/modifierContrat")
    Contrat updateContrat(@RequestBody Contrat C){
        return iContratService.updateContrat(C);
    }

    @GetMapping("/afficherContrat")
    List<Contrat> retrieveAllContrat(){
        return iContratService.retrieveAllContrat();
    }

    @GetMapping("/afficheContrat/{idContact}")
    Contrat retrieveContrat(@PathVariable Long idContact)
    {
        return iContratService.retrieveContrat(idContact);
    }

    @DeleteMapping("/supprimerContrat/{idContact}")
    void deleteContrat(@PathVariable Long idContact)
    {
        iContratService.deleteContrat(idContact);
    }
}
