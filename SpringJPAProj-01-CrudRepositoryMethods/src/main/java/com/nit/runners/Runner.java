package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.beans.Patient;
import com.nit.service.IPatientService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	IPatientService service;

	@Override
	public void run(String... args) throws Exception {

		try {
			
			Patient p = new Patient();
			p.setPname("Imran");
			p.setProblem("Fewer");
			p.setBillAmt(5000.0);
			
			String patient = service.registerPatient(p);
			System.out.println(patient);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
