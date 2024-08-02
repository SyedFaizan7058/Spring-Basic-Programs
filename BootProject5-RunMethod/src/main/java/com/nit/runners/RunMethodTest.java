package com.nit.runners;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.beans.Employee;
import com.nit.controller.PayrollOperationsController;

@Component
public class RunMethodTest implements CommandLineRunner {
	
	@Autowired
	PayrollOperationsController pay;

	@Override
	public void run(String... args) throws Exception {
		
		List<Employee> list = pay.showAllEmployeesByDesg("CLERK", "MANAGER", "");
		list.forEach(System.out::println);

	}

}
