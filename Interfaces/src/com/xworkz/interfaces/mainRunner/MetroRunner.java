package com.xworkz.interfaces.mainRunner;

import com.xworkz.interfaces.Metro;
import com.xworkz.interfaces.main.VijaynagarMetro;

public class MetroRunner {
		
		public static void main(String[] args) {
			Metro metro = new VijaynagarMetro();
			metro.name();
			metro.ticket(150);
			metro.security(true);
			
	}

}
