package com.target_class;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeekDayFinder {

	@Autowired
	private LocalDate localDate;

	public WeekDayFinder() {
		System.out.println("SeasonFinder.Constructor()");
	}

	public String showWeekDay() {

		int day = localDate.getDayOfWeek().getValue();

		if (day >= 1 && day <= 5)
			return "WorkingDay";
		else
			return "Weekend";
	}

}
