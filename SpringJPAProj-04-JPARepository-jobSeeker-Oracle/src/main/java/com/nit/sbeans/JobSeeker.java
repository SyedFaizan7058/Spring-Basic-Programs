package com.nit.sbeans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "JOBSEEKER")
@AllArgsConstructor
public class JobSeeker {

	@Id
	@Column(name = "js_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "js_name", length = 20)
	private String name;
	@Column(name = "js_qlfy", length = 20)
	private String qualification;
	@Column(name = "js_percentage")
	private Double per;
	@Column(name = "js_contact_info")
	private Long mobileNo;

	public JobSeeker() {
		System.out.println("JobSeeker.JobSeeker()- Constructor");
	}
}
