package tn.esprit.kaddem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kaddem.Entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
