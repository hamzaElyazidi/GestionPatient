package ma.emsi.RendezVousMs.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.RendezVousMs.models.Patient;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private LocalDate date ;
    private LocalTime time ;
    private Long patientId ;
    @Transient
    private Patient patient ;

}
