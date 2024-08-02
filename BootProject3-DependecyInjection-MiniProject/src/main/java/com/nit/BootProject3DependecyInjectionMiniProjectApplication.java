package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.beans.Employee;
import com.nit.controller.PayrollOperationsController;

@SpringBootApplication
public class BootProject3DependecyInjectionMiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProject3DependecyInjectionMiniProjectApplication.class,
				args);
		PayrollOperationsController bean = ctx.getBean(PayrollOperationsController.class);
		try {
			List<Employee> list = bean.showAllEmployeesByDesg("CLERK", "MANAGER", "SALESMAN");
			list.forEach(System.out::println);

			((ConfigurableApplicationContext) ctx).close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
