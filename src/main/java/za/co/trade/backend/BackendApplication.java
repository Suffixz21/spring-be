package za.co.trade.backend;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import za.co.trade.backend.model.Gender;
import za.co.trade.backend.model.User;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		User newClient = User.builder()
				.firstName("felix")
				.lastName("moalusi")
				.username("user007")
				.address("4025")
				.city("bloemhof")
				.province("nw")
				.zipCode(2660L)
				.country("zar")
				.email("felix@moalusi.com")
				.gender(Gender.MALE)
				.phoneNumber("0723907070")
				.dateOfBirth(LocalDate.of(1990, 8, 30))
				.build();
		SpringApplication.run(BackendApplication.class, args);
	}
}