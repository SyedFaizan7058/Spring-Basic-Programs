package com.nit.sbeans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "JPA_PATIENT")
@Entity
public class Patient {

	@Column(name = "PID")
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	
	@Column(name = "PNAME",length = 20)
	private String pName;
	
	@Column(name = "PROBLEM",length = 20)
	private String problem;
	
	@Column(name="Bill")
	private Double billAmt;

}
