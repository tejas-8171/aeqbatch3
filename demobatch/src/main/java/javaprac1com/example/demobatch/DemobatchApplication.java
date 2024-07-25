package javaprac1com.example.demobatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javaprac1com.example.demobatch.DemobatchApplication;

@SpringBootApplication
@RestController
public class DemobatchApplication {
	@GetMapping("/msg")
	public String show() {
		return "welcome to jekins";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemobatchApplication.class, args);
	}
}
