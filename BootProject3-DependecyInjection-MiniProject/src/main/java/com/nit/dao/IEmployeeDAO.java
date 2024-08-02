package com.nit.dao;

import java.util.List;

import com.nit.beans.Employee;

public interface IEmployeeDAO{
	
	public List<Employee> getEmployeeByDesg(String des1,String des2,String des3)throws Exception;

}
