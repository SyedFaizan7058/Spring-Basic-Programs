package com.nit.beans;

import  jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JPA_PATIENT")
@Data
public class Patient {

	@Column(name = "PID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	
	@Column(name = "PNAME", length = 20)
	private String pname;
	
	@Column(name = "PROBLEM", length = 20)
	private String problem;
	
	@Column(name = "BILL")
	private Double billAmt;

}
