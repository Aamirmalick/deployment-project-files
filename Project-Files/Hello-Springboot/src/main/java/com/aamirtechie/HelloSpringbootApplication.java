package com.aamirtechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}

	@GetMapping(value = "/msg/{name}")
	public ResponseEntity<?> getMsg(@PathVariable String name) {
		return ResponseEntity.ok(name);
	}

	@GetMapping(value = "/test")
	public ResponseEntity<?> getTest() {
		return ResponseEntity.ok("Welcome to the Springboot Cloud Deployment Apps!....");
	}

}
