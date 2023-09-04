package com.xworkz.app.boot;

import com.xworkz.app.impl.Polticimp;
import com.xworkz.app.repository.Politician;

public class PoliticsRunner {
	public static void main(String[] args) {
		System.out.println("politics");
		Politician poli = new Polticimp();
		poli.names("Siddarammiah");
		poli.names("D K Shivakumar");
		poli.names("narendra modi");
		poli.names("ramesh kumar");

	}

}
