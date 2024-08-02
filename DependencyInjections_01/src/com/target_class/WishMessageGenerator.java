package com.target_class;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime dateTime;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator-Constractor");
	}

	public String showWishMessage(String user) {

		int hour = dateTime.getHour();

		if (hour < 12) {
			return "Good Morning " + user;
		} else if (hour < 16 && hour > 12) {
			return "Good Afternoon " + user;
		} else if (hour > 16 && hour < 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}
	}

}
