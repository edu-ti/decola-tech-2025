package br.com.decolatech.decola_tech_2025;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class DecolaTech2025Application {

	public static void main(String[] args) {
		SpringApplication.run(DecolaTech2025Application.class, args);
	}

}
