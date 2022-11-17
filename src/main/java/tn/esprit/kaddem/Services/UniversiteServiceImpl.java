package tn.esprit.kaddem.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.Entities.Universite;
import tn.esprit.kaddem.Repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversite(){
        return universiteRepository.findAll();
    }
    @Override
    public   Universite addUniversite(Universite U)
    {
        return universiteRepository.save(U);
    }

    @Override
    public  void deleteUniversite(Long idUniv){
        universiteRepository.deleteById(idUniv);
    }

    @Override
    public Universite updateUniversite(Universite U){
        return universiteRepository.save(U);
    }
    @Override
    public  Universite retrieveUniversite(Long idUniv){
        return universiteRepository.findById(idUniv).orElse(null);
    }
}
