package com.jesseekoh.user_registration_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner demo(UserService userService) {
		return args -> {
			userService.registerUser(new User("John Doe", "john@gmail.com", "password"));
		};
	}
}
