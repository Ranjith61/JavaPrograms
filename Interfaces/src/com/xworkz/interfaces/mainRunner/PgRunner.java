package com.xworkz.interfaces.mainRunner;

import com.xworkz.interfaces.Pg;
import com.xworkz.interfaces.main.PgRules;

public class PgRunner {
	public static void main(String[] args) {
		Pg pg = new PgRules();
		pg.name("Suresh PG");
		pg.price(9000);
		pg.rooms();
	}

}
