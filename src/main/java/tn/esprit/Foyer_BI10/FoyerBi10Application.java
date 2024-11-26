package tn.esprit.Foyer_BI10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FoyerBi10Application {
	public static void main(String[] args) {
		SpringApplication.run(FoyerBi10Application.class, args);
	}

}
