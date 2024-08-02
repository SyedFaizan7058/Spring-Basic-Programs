package com.nit;

import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbean.SeasonFinder;

@SpringBootApplication
public class BootProject1DependecyInjectionApplication {

	public BootProject1DependecyInjectionApplication() {
		System.out.println(
				"BootProject1DependecyInjectionApplication.BootProject1DependecyInjectionApplication() - Constructor");
	}

	//@Bean Annotation to make the predefiend class as the spring bean class (LocalDate.class)
	@Bean
	public LocalDate createLDT() {
		System.out.println("BootProject1DependecyInjectionApplication.createLDT()");
		return LocalDate.now();
	}

	public static void main(String[] args) {
		//it is internally uses AnnotationConfigApplicationContext to create the IOC Container
		// get IOC Container
		ApplicationContext ctx = SpringApplication.run(BootProject1DependecyInjectionApplication.class, args);
		
		// get target spring bean class object
		SeasonFinder bean = ctx.getBean(SeasonFinder.class);
//		SeasonFinder bean = ctx.getBean("sbeans",SeasonFinder.class);
		
		// invoke the bean.method()
		String season = bean.showSeason();
		
		// print the season
		System.out.println(season);
		
		// close the container
		((ConfigurableApplicationContext) ctx).close();

	}

}
