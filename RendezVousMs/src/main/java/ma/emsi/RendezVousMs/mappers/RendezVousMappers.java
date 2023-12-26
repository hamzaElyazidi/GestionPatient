package ma.emsi.RendezVousMs.mappers;

import ma.emsi.RendezVousMs.dtos.RendezVousDTO;
import ma.emsi.RendezVousMs.entites.RendezVous;
import ma.emsi.RendezVousMs.models.Patient;
import ma.emsi.RendezVousMs.services.PatientRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RendezVousMappers {
    @Autowired
    PatientRestClient patientRestClient ;
   public  RendezVous fromRendezVousDTO(RendezVousDTO rendezVousDTO)
    {
        RendezVous rendezVous = new RendezVous() ;
        rendezVous.setDate(rendezVousDTO.getDate());
        rendezVous.setTime(rendezVousDTO.getTime());
        rendezVous.setPatientId(rendezVousDTO.getPatientId());
        Patient p = patientRestClient.getPatientById(rendezVousDTO.getPatientId());
        rendezVous.setPatient(p);
        return  rendezVous ;
    }
}
