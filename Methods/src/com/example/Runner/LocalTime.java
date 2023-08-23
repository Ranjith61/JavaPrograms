package com.example.Runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalTime {
	public static void main(String[] args) {
		
	
		LocalDate date1= LocalDate.of(2000,03, 26);
		System.out.println(date1);
		
		LocalDateTime ref = date1.atStartOfDay();
		System.out.println(ref);
		
		LocalDate date= LocalDate.now();
		System.out.println(date);
		LocalDateTime all = date.atStartOfDay();
		System.out.println(all);
		
		LocalDate loacl = LocalDate.ofYearDay(2023, 23);
		System.out.println(loacl);
		
		LocalDate time = LocalDate.now();
		System.out.println(time);
				
	}	

}
