package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProject3DependecyInjectionMiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProject3DependecyInjectionMiniProjectApplication.class, args);
//		PayrollOperationsController bean = ctx.getBean(PayrollOperationsController.class);
//		try {
//			List<Employee> list = bean.showAllEmployeesByDesg("CLERK", "MANAGER", "SALESMAN");
//			list.forEach(System.out::println);
//
//			((ConfigurableApplicationContext) ctx).close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
