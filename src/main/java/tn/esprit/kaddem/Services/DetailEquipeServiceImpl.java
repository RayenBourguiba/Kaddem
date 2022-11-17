package tn.esprit.kaddem.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.Entities.DetailEquipe;
import tn.esprit.kaddem.Repositories.DetailEquipeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailEquipeServiceImpl implements IDetailEquipeService{
    DetailEquipeRepository detailEquipeRepository;

    @Override
    public List<DetailEquipe> retrieveAllDEquipeService(){
        return detailEquipeRepository.findAll();
    }
    @Override
    public  DetailEquipe addDetailEquipe(DetailEquipe DE){
        return detailEquipeRepository.save(DE);
    }
    @Override
    public   void deleteDetailEquipe(Long idDetailEquipe){
        detailEquipeRepository.deleteById(idDetailEquipe);
    }

    @Override
    public  DetailEquipe updateDetailEquipe(DetailEquipe DE){
        return detailEquipeRepository.save(DE);
    }
    @Override
    public  DetailEquipe retrieveDetailEquipe(Long idDetailEquipe){
        return detailEquipeRepository.findById(idDetailEquipe).orElse(null);
    }
}
