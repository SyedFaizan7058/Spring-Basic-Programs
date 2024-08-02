package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.beans.Patient;

public interface IPatientRepo extends CrudRepository<Patient, Integer> {

}
