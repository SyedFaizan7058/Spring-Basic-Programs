package com.nit.service;

import com.nit.sbeans.Patient;

public interface IPatientService {
	
	public String registerPatient(Patient patient);
	public String removeAllPatient();
	public String checkById(Integer id);

}
