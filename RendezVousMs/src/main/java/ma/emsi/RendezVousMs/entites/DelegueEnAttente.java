package ma.emsi.RendezVousMs.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DelegueEnAttente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Long delegueId ;
}
