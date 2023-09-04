package com.xworkz.Associations.app.boot;

import com.xworkz.Associations.app.Button;
import com.xworkz.Associations.app.Shirt;

public class ShirtRunner {
	public static void main(String[] args) {

		Button but = new Button();
		Shirt s = new Shirt("Wrogn");
		s.setButton(but);
		s.shop();

	}

}
