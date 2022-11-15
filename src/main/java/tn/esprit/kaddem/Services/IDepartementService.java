package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.Entities.Departement;

import java.util.List;

public interface IDepartementService {
    List<Departement> retrieveAllDepartement();

    Departement addDepartement(Departement D);

    void deleteDepartement(Long idDepart);

    Departement updateDepartement(Departement D);

    Departement retrieveDepartement(Long idDepart);
}
