package com.sbdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbdockerApplication.class, args);
	}

	
	@GetMapping("/")
	public String m()
	{
		return "success";
	}
	
}
