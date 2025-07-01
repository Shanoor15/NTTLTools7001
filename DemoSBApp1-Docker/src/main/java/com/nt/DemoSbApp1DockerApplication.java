package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSbApp1DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbApp1DockerApplication.class, args);
		System.out.println("Welcome-To-Spring-Boot-Docker");
	}

}
