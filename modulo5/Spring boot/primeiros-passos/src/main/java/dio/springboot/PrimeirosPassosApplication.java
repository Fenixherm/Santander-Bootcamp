package dio.springboot;

import dio.springboot.app.login.UserSystem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run (UserSystem system) throws Exception {
		return args -> {
			system.sendSignUpConfirmation();
			system.sendWelcomeMessage();
			system.sendSignUpConfirmation();
			system.sendWelcomeMessage();
		};
	}
}
