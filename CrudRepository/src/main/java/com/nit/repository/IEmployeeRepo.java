package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.sbeans.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer>{

}
