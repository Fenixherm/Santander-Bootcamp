package dio.web.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "First web API", version = "0.1", description = "Web API"))
public class FirstWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebApiApplication.class, args);
	}

}