package com.inbuit;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {

	public static void main(String[] args) {
		System.out.println("priniting the LocalDate values");
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate ref = LocalDate.ofYearDay(2002, 6);
		System.out.println(ref);
		
		LocalDate ref1 = LocalDate.of(2004,3,12);
		System.out.println(ref1);
		
		LocalDate parse = LocalDate.ofEpochDay(987777);
		System.out.println(parse);
		
		LocalDate loc = LocalDate.ofYearDay(2023,25);
		System.out.println(loc);
		
		
		
	}

}
