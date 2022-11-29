package com.gcontreras.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository){
		return  args -> {
			Student maria = new Student(
					"maria",
					"jones",
					"maria.jones@gmail.com",
					21
			);
			repository.save(maria);
		};
	}
}
