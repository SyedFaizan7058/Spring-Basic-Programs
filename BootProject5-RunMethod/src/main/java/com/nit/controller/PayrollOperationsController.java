package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.beans.Employee;
import com.nit.service.IEmployeeService;

@Controller
public class PayrollOperationsController {

	@Autowired
	IEmployeeService service;

	public List<Employee> showAllEmployeesByDesg(String des1, String des2, String des3) throws Exception{

		List<Employee> list = service.fetchAllEmployeeByDesg(des1, des2, des3);
		return list;
	}

}
