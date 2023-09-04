package com.xworkz.Associations.app.boot;

import com.xworkz.Associations.app.Pant;
import com.xworkz.Associations.app.Zip;

public class PantRunner {
	public static void main(String[] args) {
		Zip z = new Zip();
		Pant pant = new Pant("jocky");
		pant.setZip(z);
		pant.manufacturer();
	}

}
