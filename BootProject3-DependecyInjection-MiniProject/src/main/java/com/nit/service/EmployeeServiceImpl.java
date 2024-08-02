package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.beans.Employee;
import com.nit.dao.IEmployeeDAO;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO dao;

	@Override
	public List<Employee> fetchAllEmployeeByDesg(String des1, String des2, String des3) throws Exception {

		List<Employee> list = dao.getEmployeeByDesg(des1, des2, des3);
		
		return list;
	}

}
