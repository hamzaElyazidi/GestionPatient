package ma.emsi.PatientMs;

import ma.emsi.PatientMs.entities.Patient;
import ma.emsi.PatientMs.enums.Genre;
import ma.emsi.PatientMs.repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class PatientMsApplication implements CommandLineRunner {
	@Autowired
	PatientRepository patientRepository ;

	public static void main(String[] args) {
		SpringApplication.run(PatientMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patient p = new Patient() ;
		p.setNom("Allami");
		p.setPrenom("Ahmed");
		p.setSexe(Genre.HOMME);
		p.setDateNaissance(LocalDate.of(1999,9,9));
		p.setEmail("allami.ahmed@gmail.com");
		p.setAddress("Address 1");
		p.setTelephone("0666987655");
		Patient p2 = new Patient() ;
		p2.setNom("Radi");
		p2.setPrenom("Amina");
		p2.setSexe(Genre.FEMME);
		p2.setDateNaissance(LocalDate.of(1988,12,12));
		p2.setEmail("radi.amina@gmail.com");
		p2.setAddress("Address 2");
		p2.setTelephone("0766334455");
		patientRepository.save(p2) ;
		patientRepository.save(p) ;
	}
}
