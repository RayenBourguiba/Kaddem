package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {
    List<DetailEquipe> retrieveAllDEquipeService();

    DetailEquipe addDetailEquipe(DetailEquipe DE);

    void deleteDetailEquipe(Long idDetailEquipe);

    DetailEquipe updateDetailEquipe(DetailEquipe DE);

    DetailEquipe retrieveDetailEquipe(Long idDetailEquipe);
}