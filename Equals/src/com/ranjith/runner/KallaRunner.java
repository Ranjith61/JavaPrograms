package com.ranjith.runner;

import com.ranjith.app.Kalla;

public class KallaRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in KallaRunner");

		Kalla kalla = new Kalla("balaji", 32, 10, true, "Delhi", 1000);
		System.out.println(kalla);

		Kalla kalla1 = new Kalla("balaji", 32, 10, true, "Delhi", 1000);
		System.out.println(kalla1);
		System.out.println("************************");

		boolean same = kalla.equals(kalla1);
		System.out.println("Contetns are same:" + same);
	}

}


