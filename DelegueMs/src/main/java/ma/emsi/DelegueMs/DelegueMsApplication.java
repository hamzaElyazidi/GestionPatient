package ma.emsi.DelegueMs;

import ma.emsi.DelegueMs.entites.Delegue;
import ma.emsi.DelegueMs.repos.DelegueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DelegueMsApplication implements CommandLineRunner {
    @Autowired
	DelegueRepository delegueRepository ;

	public static void main(String[] args) {
		SpringApplication.run(DelegueMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Delegue d = new Delegue() ;
		d.setNom("Kamali");
		d.setPrenom("Ahmed");
		d.setEmail("kamali@gmail.com");
		d.setTelephone("0766542233");
		delegueRepository.save(d) ;
		Delegue d1 = new Delegue() ;
		d1.setNom("Wardi");
		d1.setPrenom("Fatima");
		d1.setEmail("wardi.fatima@gmail.com");
		d1.setTelephone("0666662233");
		delegueRepository.save(d1) ;

	}
}
