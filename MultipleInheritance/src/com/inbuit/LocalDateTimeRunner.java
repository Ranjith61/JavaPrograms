package com.inbuit;

import java.time.LocalDateTime;

public class LocalDateTimeRunner {
	
	public static void main(String[] args) {
		
		System.out.println("priniting the LocalDateTime values");
		LocalDateTime ref = LocalDateTime.now();
		System.out.println(ref);
		
		LocalDateTime time = LocalDateTime.of(2020, 12, 3, 3, 2);
		System.out.println(time);
		
		LocalDateTime sec = LocalDateTime.of(2023, 8, 25, 13, 21, 10, 1);
		System.out.println(sec);
		
		LocalDateTime time1 = LocalDateTime.of(2020, 12, 30, 20, 2);
		System.out.println(time1);
		
		LocalDateTime time2 = LocalDateTime.of(2022, 6, 3, 5, 3, 1, 3);
		System.out.println(time2);
	}

}
