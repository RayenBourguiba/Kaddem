package tn.esprit.kaddem.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.Entities.Contrat;
import tn.esprit.kaddem.Repositories.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {
    ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrat(){
        return contratRepository.findAll();
    }

    @Override
    public  Contrat addContrat(Contrat C){
        return contratRepository.save(C);
    }

    @Override
    public void deleteContrat(Long idContrat){
        contratRepository.deleteById(idContrat);
    }
    @Override
    public Contrat updateContrat(Contrat C){
        return contratRepository.save(C);
    }
    @Override
    public  Contrat retrieveContrat(Long idContrat){
        return contratRepository.findById(idContrat).orElse(null);
    }
}