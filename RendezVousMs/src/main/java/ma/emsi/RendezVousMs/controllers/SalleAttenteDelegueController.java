package ma.emsi.RendezVousMs.controllers;

import ma.emsi.RendezVousMs.entites.DelegueEnAttente;
import ma.emsi.RendezVousMs.entites.PatientEnAttente;
import ma.emsi.RendezVousMs.models.Delegue;
import ma.emsi.RendezVousMs.models.Patient;
import ma.emsi.RendezVousMs.repos.RendezVousRepo;
import ma.emsi.RendezVousMs.repos.SalleAttenteDelegueRepo;
import ma.emsi.RendezVousMs.repos.SalleAttenteRepo;
import ma.emsi.RendezVousMs.services.DelegueRestClient;
import ma.emsi.RendezVousMs.services.PatientRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SalleAttenteDelegueController {
    @Autowired
    SalleAttenteDelegueRepo salleAttenteRepo ;
    @Autowired
    DelegueRestClient delegueRestClient;
    @PostMapping("/rendezvous/{id}/salleAttenteDelegue")
    public Delegue addDelegueToWaitingRoom(@PathVariable Long id)
    {
        if(salleAttenteRepo
                .findAll()
                .stream()
                .anyMatch(salleAttente -> salleAttente.getDelegueId().equals(id)))
        {
            System.out.println("Delegue already in waiting room");
            return null ;
        }
            DelegueEnAttente d = new DelegueEnAttente() ;
            d.setDelegueId(id);
            salleAttenteRepo.save(d) ;
            return delegueRestClient.getDelegueById(id) ;

    }
    @GetMapping("/rendezvous/salleAttenteDelegue")
    public List<Delegue> getAllWaitingDelegues()
    {
        return salleAttenteRepo.findAll().stream()
                .map(delegueEnAttente -> delegueEnAttente.getDelegueId())
                .map(id->delegueRestClient.getDelegueById(id))
                .toList();
    }
    @DeleteMapping("/rendezvous/{id}/salleAttenteDelegue")
    public void deleteDelegueFromWaitingRoom(@PathVariable Long id)
    {
        salleAttenteRepo.deleteById(id);
    }

}
