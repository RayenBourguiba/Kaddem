package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiant();

    Etudiant addEtudiant(Etudiant Et);

    void deleteEtudiant(Long idEtudiant);

    Etudiant updateEtudiant(Etudiant Et);

    Etudiant retrieveEtudiant(Long idEtudiant);
}
