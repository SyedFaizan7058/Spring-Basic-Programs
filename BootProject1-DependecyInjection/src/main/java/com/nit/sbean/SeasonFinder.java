package com.nit.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component Annotation to this userdefiend class as spring bean class
@Component("sbeans")
public class SeasonFinder {

	//@Autowired Annotation used for field injection
	@Autowired
	LocalDate date;

	public SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()- Constructor");
	}

	public String showSeason() {
		int value = date.getMonthValue();
		System.out.println("SeasonFinder.showSeason()");

		if (value >= 3 && value <= 6)
			return "Summer Season";
		else if (value >= 7 && value <= 10)
			return "Rainy Season";
		else
			return "Winter Season";
	}
}
