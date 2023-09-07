package com.xworkz.app.runner;

import com.xworkz.app.service.JuiceServiceImpl;
import com.xworkz.app.repository.Juice;
import com.xworkz.app.repository.JuicerepsitoryImpl;

public class JuiceRunner {
	public static void main(String[] args) {
		Juice jail = new JuicerepsitoryImpl();

		JuiceServiceImpl com = new JuiceServiceImpl(jail);
		com.validation("onion");
		com.validation("onion");
		
	}

}
