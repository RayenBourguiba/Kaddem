package tn.esprit.kaddem.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.Entities.Departement;
import tn.esprit.kaddem.Repositories.DepartementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartementServiceImpl implements IDepartementService {
    DepartementRepository departementRepository;
    @Override
    public List<Departement> retrieveAllDepartement(){
        return departementRepository.findAll();
    }

    @Override
    public  Departement addDepartement(Departement D){
        return departementRepository.save(D);
    }

    @Override
    public  void deleteDepartement(Long idDepart){
        departementRepository.deleteById(idDepart);
    }

    @Override
    public  Departement updateDepartement(Departement D){
        return departementRepository.save(D);
    }

    @Override
    public Departement retrieveDepartement(Long idDepart){
        return departementRepository.findById(idDepart).orElse(null);
    }
}