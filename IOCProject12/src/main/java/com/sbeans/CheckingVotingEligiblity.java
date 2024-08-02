package com.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("com/commons/info.properties")
public class CheckingVotingEligiblity {

	@Value("${voter.id}")
	Integer id;
	@Value("${voter.name}")
	String name;
	@Value("${voter.age}")
	Integer age;

	public CheckingVotingEligiblity() {
		System.out.println("CheckingVotingEligiblity.CheckingVotingEligiblity()--Constructor");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("CheckingVotingEligiblity.myInit()");
		if(name==null || age<=0) {
			throw new IllegalArgumentException("Please check your name or age...");
		}
	}

	public String checkEligiblity() {
		if (age > 18) {
			return "" + name + " You are eligible for vote..\nVerified on " + LocalDateTime.now();
		} else
			return "" + name + " You are not eligible for vote..\nVerified on " + LocalDateTime.now();

	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("CheckingVotingEligiblity.myDestroy()");
		id = null;
		name = null;
		age = null;
	}

}
