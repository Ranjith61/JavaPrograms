package com.xworkz.app.service;

import com.xworkz.app.repository.Juice;

public class JuiceServiceImpl implements JuiceService {
	Juice juice;

	// constructor
	public JuiceServiceImpl(Juice juice) {
		this.juice = juice;

	}

	@Override
	public void validation(String name) {
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 10) {
			boolean ref = this.juice.isExist(name);
			if (!ref) {
				System.out.println("it is valid");
				juice.store(name);
				return;
			} else {
				System.err.println("it is not done");
			}

		} else {
			System.out.println("it is not valid");
		}

	}
}