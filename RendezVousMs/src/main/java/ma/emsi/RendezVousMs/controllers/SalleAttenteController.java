package ma.emsi.RendezVousMs.controllers;

import ma.emsi.RendezVousMs.entites.PatientEnAttente;
import ma.emsi.RendezVousMs.models.Patient;
import ma.emsi.RendezVousMs.repos.RendezVousRepo;
import ma.emsi.RendezVousMs.repos.SalleAttenteRepo;
import ma.emsi.RendezVousMs.services.PatientRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalleAttenteController {
    @Autowired
    SalleAttenteRepo salleAttenteRepo ;
    @Autowired
    RendezVousRepo rendezVousRepo;
    @Autowired
    PatientRestClient patientRestClient ;
    @PostMapping("/rendezvous/{id}/salleAttente")
    public Patient addPatientToSalleAttente(@PathVariable Long id)
    {
        if(salleAttenteRepo
                .findAll()
                .stream()
                .anyMatch(salleAttente -> salleAttente.getPatientId().equals(id)))
        {
            System.out.println("Patient already in waiting room");
            return null ;
        }
        if (rendezVousRepo.
                findAll()
                .stream()
                .anyMatch(rendezVous -> rendezVous.getPatientId().equals(id)))
        {
            PatientEnAttente p = new PatientEnAttente() ;
             p.setPatientId(id);
             salleAttenteRepo.save(p) ;
             return patientRestClient.getPatientById(id) ;
        }
        else {
            System.out.println("rendez-vous not found");
            return null ;
        }

    }
    @GetMapping("/rendezvous/salleAttente")
    public List<Patient > getAllWaitingPatient()
    {
        return salleAttenteRepo.findAll().stream()
                .map(patientEnAttente -> patientEnAttente.getPatientId())
                .map(id->patientRestClient.getPatientById(id))
                .toList();
    }
    @DeleteMapping("/rendezvous/{id}/salleAttente")
    public void deletePatientFromWaitingRoom(@PathVariable Long id)
    {
        salleAttenteRepo.deleteById(id);
    }

}
