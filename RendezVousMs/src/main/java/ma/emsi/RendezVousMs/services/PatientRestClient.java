package ma.emsi.RendezVousMs.services;

import ma.emsi.RendezVousMs.models.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@FeignClient(name = "PATIENT-SERVICE")
public interface PatientRestClient {
    @GetMapping(path = "/patients/{id}")
    Patient getPatientById(@PathVariable Long id);
    @GetMapping(path = "/patients")
    List<Patient> getPatients();
}
