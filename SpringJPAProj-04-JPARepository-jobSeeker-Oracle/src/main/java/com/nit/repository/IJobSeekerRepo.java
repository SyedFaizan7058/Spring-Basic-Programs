package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.sbeans.JobSeeker;

public interface IJobSeekerRepo extends JpaRepository<JobSeeker, Integer>{
	
	public List<JobSeeker> findByNameEquals(String name);
	public List<JobSeeker> getByMobileNo(Long phno);
	public List<JobSeeker> readByQualification(String qlfy);
	public List<JobSeeker> findByNameStartingWith(String letter);

}
