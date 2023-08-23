package com.example.Runner;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalDateTimeRunner {
	public static void main(String[] args) {
		
	LocalDateTime local =LocalDateTime.now();
	System.out.println(local);
	
	int ref =local.getHour();
	System.out.println(ref);
	
	DayOfWeek day =local.getDayOfWeek();
	System.out.println(day);
	
	LocalDateTime ref3 =LocalDateTime.of(2002, 1, 6, 4, 5);
	System.out.println(ref3);
	
	int day2 = ref3.getDayOfMonth();
	System.out.println(day2);
	}

}
