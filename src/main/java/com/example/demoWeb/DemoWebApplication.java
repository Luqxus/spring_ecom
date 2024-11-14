package com.example.demoWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.demoWeb.repository")
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

}
