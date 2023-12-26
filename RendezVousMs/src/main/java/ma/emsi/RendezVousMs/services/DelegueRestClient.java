package ma.emsi.RendezVousMs.services;

import ma.emsi.RendezVousMs.models.Delegue;
import ma.emsi.RendezVousMs.models.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "DELEGUE-SERVICE")
public interface DelegueRestClient {
    @GetMapping(path = "/delegues/{id}")
    Delegue getDelegueById(@PathVariable Long id);
}
