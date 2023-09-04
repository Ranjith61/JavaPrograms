package com.xworkz.Associations.app.boot;

import com.xworkz.Associations.app.Bus;
import com.xworkz.Associations.app.Passanger;

public class PassangerRunner {
	public static void main(String[] args) {
		Bus b = new Bus();
		Passanger pas = new Passanger("Rohan");
		pas.setBus(b);
		pas.train();
	}

}
