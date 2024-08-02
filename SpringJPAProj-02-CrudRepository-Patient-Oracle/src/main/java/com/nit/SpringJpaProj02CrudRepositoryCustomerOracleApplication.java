package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Patient;
import com.nit.service.ImpPatientService;

@SpringBootApplication
public class SpringJpaProj02CrudRepositoryCustomerOracleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringJpaProj02CrudRepositoryCustomerOracleApplication.class, args);
		
		ImpPatientService bean = run.getBean(ImpPatientService.class);
		
		Patient p = new Patient();
		p.setPId(101);
		p.setPName("Faizan");
		p.setProblem("Fewer");
		p.setBillAmt(500.0);
		
//		String msg = bean.registerPatient(p);
		String msg = bean.checkById(102);
		
		System.out.println(msg);
	}

}
