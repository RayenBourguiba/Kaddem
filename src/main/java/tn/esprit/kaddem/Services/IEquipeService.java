package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipe();

    Equipe addEquipe(Equipe E);

    void deleteEquipe(Long idEquipe);

    Equipe updateEquipe(Equipe E);

    Equipe retrieveEquipe(Long idEquipe);
}
