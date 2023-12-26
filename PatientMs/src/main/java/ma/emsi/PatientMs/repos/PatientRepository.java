package ma.emsi.PatientMs.repos;

import ma.emsi.PatientMs.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
