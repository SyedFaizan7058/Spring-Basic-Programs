package com.nit;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.UserController;

@SpringBootApplication
public class BootProject4DependencyInjectionAssignmentApplication {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext run = SpringApplication
				.run(BootProject4DependencyInjectionAssignmentApplication.class, args);
		UserController bean = run.getBean(UserController.class);

		List<User> list = bean.showAllUsers();
		list.forEach(System.out::println);
		System.out.println("--------------------------------");
	}

}
