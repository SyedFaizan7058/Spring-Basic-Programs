package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration_class.AppConfig;
import com.target_class.WishMessageGenerator;

public class TestDependencyInjection {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		String msg = wmg.showWishMessage("Faizan");
		System.out.println(msg);

		context.close();

	}

}
