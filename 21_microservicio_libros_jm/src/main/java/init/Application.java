package init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// Importante revisar para escanear todos los paquetes
@EntityScan
@EnableJpaRepositories

// No es necesaria la anotacion por haberlos metido dentro del paquete init
//@SpringBootApplication(scanBasePackages = {"controller","service", "init"})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
