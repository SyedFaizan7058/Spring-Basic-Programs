package com.nit.runners;

import org.springframework.boot.CommandLineRunner;


public class TestRunMethod implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("TestRunMethod.run()");	
		for(String arg:args) {
			System.out.println(arg);
		}

	}

}
