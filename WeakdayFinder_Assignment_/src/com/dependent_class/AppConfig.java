package com.dependent_class;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.target_class")
public class AppConfig {

	@Bean(name = "cld")
	public LocalDate createLocalDate() {
		return LocalDate.now();
	}

}
