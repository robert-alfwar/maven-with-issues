package se.nackademin.mavenwithissues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenWithIssuesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenWithIssuesApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		if ("olle".equals(name)) {
			return "My code is so cool!!";
		}
		return String.format("Hello %s!", name);
	}

}
