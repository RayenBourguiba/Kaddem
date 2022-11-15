package tn.esprit.kaddem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kaddem.Entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
