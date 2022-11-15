package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite U);

    void deleteUniversite(Long idUniv);

    Universite updateUniversite(Universite U);

    Universite retrieveUniversite(Long idUniv);
}
