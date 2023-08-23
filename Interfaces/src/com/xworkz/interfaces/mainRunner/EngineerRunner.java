package com.xworkz.interfaces.mainRunner;

import com.xworkz.interfaces.Engineer;
import com.xworkz.interfaces.main.EngineerRules;

public class EngineerRunner {
	public static void main(String[] args) {
			Engineer engineer = new EngineerRules();
			engineer.name();
			engineer.job(true);
			engineer.salary(50000);
		}
	}

