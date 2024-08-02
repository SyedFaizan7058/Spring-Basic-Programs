package com.nit.service;

import java.util.List;

import com.nit.beans.Employee;

public interface IEmployeeService {

	public List<Employee> fetchAllEmployeeByDesg(String des1, String des2, String des3) throws Exception;

}
