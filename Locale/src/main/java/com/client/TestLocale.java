package com.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class TestLocale {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Language Code :");
		String lan = sc.nextLine();
		System.out.println("Enter Country Code :");
		String con = sc.nextLine();
		
		Locale locale = new Locale(lan,con);
		
		String m1 = ctx.getMessage("wish.msg", new Object[]{}, locale);
		String m2 = ctx.getMessage("seeu.msg", new Object[]{}, locale);
		System.out.println(m1+"....."+m2);
		
		sc.close();
		ctx.close();

	}

}
