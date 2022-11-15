package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.Etudiant;
import tn.esprit.kaddem.Repositories.EtudiantRepository;

import java.util.List;

public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiant(){
        return  etudiantRepository.findAll();
    }
    @Override

    public Etudiant addEtudiant(Etudiant Et){
        return etudiantRepository.save(Et);
    }
    @Override
    public  void deleteEtudiant(Long idEtudiant){
        etudiantRepository.deleteById(idEtudiant);
    }
    @Override
    public Etudiant updateEtudiant(Etudiant Et){
        return etudiantRepository.save(Et);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant){
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }
}