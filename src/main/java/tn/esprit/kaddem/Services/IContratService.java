package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.Contrat;

import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrat();

    Contrat addContrat(Contrat C);

    void deleteContrat(Long idContrat);

    Contrat updateContrat(Contrat C);

    Contrat retrieveContrat(Long idContrat);
}
