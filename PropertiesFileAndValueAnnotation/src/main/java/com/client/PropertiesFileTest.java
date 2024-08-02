package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.config.AppConfig;
import com.sbeans.PersonInformation;

public class PropertiesFileTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonInformation bean = ctx.getBean(PersonInformation.class);
		System.out.println(bean);
		
		Environment env = ctx.getEnvironment();
		System.out.println(env.getProperty("per.name"));
		
		ctx.close();

	}

}
