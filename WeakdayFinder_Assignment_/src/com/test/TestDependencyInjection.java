package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependent_class.AppConfig;
import com.target_class.WeekDayFinder;

public class TestDependencyInjection {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WeekDayFinder bean = context.getBean(WeekDayFinder.class);
		String season = bean.showWeekDay();
		System.out.println(season);
		
		context.close();
	}

}
