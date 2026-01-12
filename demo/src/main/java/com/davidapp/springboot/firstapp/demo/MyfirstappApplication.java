package com.davidapp.springboot.firstapp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstappApplication.class, args);
	}

	@Value("${coach.name}")
	private String coachName;

	@Value("{my.name}")
	private String myName;
}
