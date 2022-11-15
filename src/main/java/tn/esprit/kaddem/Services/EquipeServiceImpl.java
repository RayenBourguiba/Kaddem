package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.Equipe;
import tn.esprit.kaddem.Repositories.EquipeRepository;

import java.util.List;

public class EquipeServiceImpl implements IEquipeService{
    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipe(){
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe E){
        return equipeRepository.save(E);
    }
    @Override
    public void deleteEquipe(Long idEquipe){
        equipeRepository.deleteById(idEquipe);
    }

    @Override
    public Equipe updateEquipe(Equipe E){
        return equipeRepository.save(E);
    }

    @Override
    public Equipe retrieveEquipe(Long idEquipe){
        return equipeRepository.findById(idEquipe).orElse(null);
    }
}