package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.sbeans.Patient;

public interface IPatientRepo extends CrudRepository<Patient, Integer> {

}
