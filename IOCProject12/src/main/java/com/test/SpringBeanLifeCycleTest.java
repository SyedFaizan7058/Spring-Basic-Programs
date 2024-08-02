package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.CheckingVotingEligiblity;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CheckingVotingEligiblity bean = ctx.getBean(CheckingVotingEligiblity.class);
		try {
			String s = bean.checkEligiblity();
			System.out.println("---------------------------------------------");
			System.out.println(s);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		ctx.close();
	}

}
