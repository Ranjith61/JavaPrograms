package com.xworkz.app.boot;

import com.xworkz.app.impl.JacketImp;
import com.xworkz.app.repository.Jacket;

public class JacketRunner {
	public static void main(String[] args) {
		System.out.println("Running in main");
		Jacket jacket = new JacketImp();
		jacket.store("Allen solly");
		jacket.store("vanhusen");
		jacket.store("Flying Machine");
		jacket.store("Arrow");
		jacket.store("Techno Sport");
		jacket.store("Roadster");
		jacket.store("nike");
		jacket.store("Puma");
		jacket.store("Local");

	}

}
