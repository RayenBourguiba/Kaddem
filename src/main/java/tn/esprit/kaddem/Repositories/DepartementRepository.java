package tn.esprit.kaddem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kaddem.Entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
