package it.gov.pagopa.tkm.ms.consentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.*;

@SpringBootApplication
@EnableCaching
public class ConsentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsentManagerApplication.class, args);
	}

}
