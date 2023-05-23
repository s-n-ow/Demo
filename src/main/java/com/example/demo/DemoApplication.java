package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @ComponentScan("com.example.*")
@ComponentScan({"com.example.controller", "com.example.service"}) //array of strings.
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


//using the repository class we'll write the code for interacting with the db...insert, delete, update, pagination, sorting everything with just 
//entity and repository package.
//each repository will be an interface.
