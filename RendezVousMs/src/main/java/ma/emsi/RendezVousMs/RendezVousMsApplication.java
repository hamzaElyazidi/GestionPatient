package ma.emsi.RendezVousMs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RendezVousMsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RendezVousMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
