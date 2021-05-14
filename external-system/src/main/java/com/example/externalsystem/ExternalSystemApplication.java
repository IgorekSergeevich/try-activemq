package com.example.externalsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalSystemApplication {
	public static void main(String[] args) {
		System.out.print("Feature");
		SpringApplication.run(ExternalSystemApplication.class, args);
	}

}
