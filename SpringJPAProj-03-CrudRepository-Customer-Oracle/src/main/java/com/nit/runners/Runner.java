package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.beans.Customer;
import com.nit.service.CustomerServiceImp;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	CustomerServiceImp imp;

	@Override
	public void run(String... args) throws Exception {

		try {

			Customer customer = new Customer(10, "Faizan", "Oil", 7058653637L, "Hyd", 2200.0);
			
			String msg = imp.registerCustomer(customer);
			
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
