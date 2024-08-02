package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.beans.Patient;
import com.nit.repository.IPatientRepo;

@Service
public class ImplPatientService implements IPatientService {

	@Autowired
	IPatientRepo patinetRepo;

	@Override
	public String registerPatient(Patient patient) {

		System.out.println("Patient Id before save :" + patient.getPid());
		Patient p = patinetRepo.save(patient);
		System.out.println("Patient Id after save :" + p.getPid());

		return "Register Successfull...";
	}

}
