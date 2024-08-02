package com.target_class;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeasonFinder {

	@Autowired
	private LocalDate localDate;

	public SeasonFinder() {
		System.out.println("SeasonFinder.Constructor()");
	}

	public String showSeason(String user) {

		int month = localDate.getMonthValue();

		if (month >= 3 && month <= 6)
			return "Summer";
		else if (month >= 7 && month <= 10)
			return "Monsoon";
		else 
			return "Winter";
	}

}
