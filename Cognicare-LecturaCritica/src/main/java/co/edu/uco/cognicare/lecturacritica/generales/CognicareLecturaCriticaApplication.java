package co.edu.uco.cognicare.lecturacritica.generales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CognicareLecturaCriticaApplication {
	
	@GetMapping("/getData")
	public String getMessage() {
		return "Accessed by HTTPS protocal";
	}

	public static void main(String[] args) {
		SpringApplication.run(CognicareLecturaCriticaApplication.class, args);
	}

}
