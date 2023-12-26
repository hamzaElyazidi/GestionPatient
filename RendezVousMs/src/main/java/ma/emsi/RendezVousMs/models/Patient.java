package ma.emsi.RendezVousMs.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Long id;
    private String address ;
    private String email ;
    private String nom ;
    private String prenom ;
    private String sexe ;
    private String telephone ;
    private LocalDate dateNaissance ;
}
