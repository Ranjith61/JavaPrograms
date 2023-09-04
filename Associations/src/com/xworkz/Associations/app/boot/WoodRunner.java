package com.xworkz.Associations.app.boot;

import com.xworkz.Associations.app.Paper;
import com.xworkz.Associations.app.Wood;

public class WoodRunner {
	public static void main(String[] args) {
		Paper pap = new Paper();
		Wood woo = new Wood("Teak");
		woo.setPaper(pap);
		woo.trees();
	}

}
