package tn.esprit.kaddem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kaddem.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
