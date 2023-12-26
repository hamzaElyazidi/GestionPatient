package ma.emsi.RendezVousMs.repos;

import ma.emsi.RendezVousMs.entites.DelegueEnAttente;
import ma.emsi.RendezVousMs.entites.PatientEnAttente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleAttenteDelegueRepo extends JpaRepository<DelegueEnAttente,Long> {
}
