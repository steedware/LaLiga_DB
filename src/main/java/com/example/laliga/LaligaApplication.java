package com.example.laliga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.laliga.repository")
@EntityScan(basePackages = "com.example.laliga.model")
public class LaligaApplication {
	public static void main(String[] args) {
		SpringApplication.run(LaligaApplication.class, args);
	}
}