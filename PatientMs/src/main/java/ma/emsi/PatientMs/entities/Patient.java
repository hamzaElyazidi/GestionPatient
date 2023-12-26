package ma.emsi.PatientMs.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.PatientMs.enums.Genre;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String address ;
    private String email ;
    private String nom ;
    private String prenom ;
    @Enumerated(EnumType.STRING)
    private Genre sexe ;
    private String telephone ;
    private LocalDate dateNaissance ;

}
