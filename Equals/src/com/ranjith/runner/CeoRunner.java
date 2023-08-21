package com.ranjith.runner;

import com.ranjith.app.Ceo;

public class CeoRunner {
	public static void main(String[] args) {
		Ceo ceo = new Ceo("Sundar pichai",52,"Google",10,3566.66,"6 years");
		System.out.println(ceo);
		
		Ceo ceo1 = new Ceo("Sundar pichai",52,"TCS",18,674338.33,"4 years");
		System.out.println(ceo1);
		
		System.out.println("*************");
	
		boolean same = ceo.equals(ceo1);
		System.out.println("Properties are same = "+same);
	}
}
