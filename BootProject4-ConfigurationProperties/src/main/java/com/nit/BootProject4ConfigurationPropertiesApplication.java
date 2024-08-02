package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Company;

@SpringBootApplication
public class BootProject4ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProject4ConfigurationPropertiesApplication.class, args);
		Company bean = ctx.getBean(Company.class);
		System.out.println(bean);
	}

}
