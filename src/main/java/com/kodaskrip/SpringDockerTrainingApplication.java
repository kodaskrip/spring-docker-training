package com.kodaskrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringDockerTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerTrainingApplication.class, args);
	}

	@GetMapping(value = { "/" })
	public String index() {
		return "index";
	}
	
}
