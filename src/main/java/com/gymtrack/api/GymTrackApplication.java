package com.gymtrack.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class GymTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymTrackApplication.class, args);
	}

}