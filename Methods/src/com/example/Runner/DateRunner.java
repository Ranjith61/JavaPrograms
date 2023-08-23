package com.example.Runner;

import java.util.Date;

public class DateRunner {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Present Date = "+date);
		
		long time = date.getTime();
		System.out.println("Get Time: "+time);
		
		Date futureDate = new Date(86400000);
		boolean after = date.after(futureDate);
		System.out.println(after);
		
		Date beforeDate = new Date(23865433);
		boolean before = beforeDate.before(beforeDate);
		System.out.println(before);
		
		Date date1 = new Date(676236536);
		Object obj = date1.clone();
		System.out.println(obj);
		

	}

}
