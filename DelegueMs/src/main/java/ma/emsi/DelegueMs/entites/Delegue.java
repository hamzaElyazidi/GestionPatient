package ma.emsi.DelegueMs.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Delegue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String address ;
    private String email ;
    private String nom ;
    private String prenom ;
    private String telephone ;

}
