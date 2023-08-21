package com.ranjith.runner;

import com.ranjith.app.Minister;

public class MinisterRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Invoking main in ministerRunner");
		Minister minister = new Minister("Siddarammiah",58,77700000,"BSC",5,"JDS");
		System.out.println(minister);
		
		Minister minister2 = new Minister("Siddarammiah",56,8955433,"BE",4,"Congress");
		System.out.println(minister2);
		
		System.out.println("---------------");
		
		boolean same = minister.equals(minister2);
		System.out.println("Contents are same = "+same);
		}

}
