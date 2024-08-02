package com.nit.beans;

import lombok.Data;

@Data
public class Employee {

	private Integer eno;
	private String ename;
	private String job;
	private Double salary;
	private Integer depno;
	private Double grossSalary;
	private Double netSalary;

}
