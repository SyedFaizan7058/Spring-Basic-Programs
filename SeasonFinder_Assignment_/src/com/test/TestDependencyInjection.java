package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependent_class.AppConfig;
import com.target_class.SeasonFinder;

public class TestDependencyInjection {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SeasonFinder bean = context.getBean(SeasonFinder.class);
		String season = bean.showSeason("Faizan");
		System.out.println(season);
		
		context.close();
	}

}
