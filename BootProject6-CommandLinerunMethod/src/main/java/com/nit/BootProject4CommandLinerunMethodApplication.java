package com.nit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootProject4CommandLinerunMethodApplication {

	@Bean
	public CommandLineRunner runner1() {

		CommandLineRunner clr = (String... args) -> {
			System.out.println("Shedule Running....");
		};
		return clr;
	}
	@Bean
	public CommandLineRunner runner2() {

		CommandLineRunner clr = (String... args) -> {
			System.out.println("Timer running....");
		};
		return clr;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootProject4CommandLinerunMethodApplication.class, args);

	}

}
