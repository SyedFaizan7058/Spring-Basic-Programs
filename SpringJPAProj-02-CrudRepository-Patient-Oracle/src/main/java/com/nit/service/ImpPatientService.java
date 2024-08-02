package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.repository.IPatientRepo;
import com.nit.sbeans.Patient;

@Service
public class ImpPatientService implements IPatientService {

	@Autowired
	IPatientRepo repo;

	@Override
	public String registerPatient(Patient patient) {

		Patient p = repo.save(patient);

		System.out.println("Id after register :" + p.getPId());

		return "Patient Register Successfully...";
	}

	@Override
	public String removeAllPatient() {

		long count = repo.count();
		repo.deleteAll();
		return "" + count + " record are deleted...";
	}

	@Override
	public String checkById(Integer id) {

		Optional<Patient> byId = repo.findById(id);
		Patient patient = byId.get();
		System.out.println(patient);

		return id + " id is finded...";
	}


}
