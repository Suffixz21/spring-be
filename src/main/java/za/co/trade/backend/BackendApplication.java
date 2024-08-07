package za.co.trade.backend;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.co.trade.backend.model.User;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		User newClient = User.builder().firstName("felix").lastName("moalusi")
		.dob(LocalDate.of(1990, 8, 30))
		.build();
		SpringApplication.run(BackendApplication.class, args);
	}

}
