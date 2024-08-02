package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.repository.IJobSeekerRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	IJobSeekerRepo iJobSeekerRepo;

	@Override
	public void run(String... args) throws Exception {

//		JobSeeker j = new JobSeeker(101, "Azim", "B.Tech", 90.64, 7058653637L);
//		
//		JobSeeker job = iJobSeekerRepo.save(j);
//		
//		System.out.println("Id :"+job.getId());

//		iJobSeekerRepo.findByNameEquals("Jon").forEach(System.out::println);
		
//		iJobSeekerRepo.getByMobileNo(7058653637L).forEach(System.out::println);
//		iJobSeekerRepo.readByQualification("B.Tech").forEach(System.out::println);
//		
		
		iJobSeekerRepo.findByNameStartingWith("A").forEach(System.out::println);
		

	}

}
