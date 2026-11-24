package com.wipro.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamplerestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplerestDemoApplication.class, args);
		System.out.println("Sample Rest Hello!!!");
	}

}
