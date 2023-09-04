package com.xworkz.Associations.app.boot;

import com.xworkz.Associations.app.Laptop;
import com.xworkz.Associations.app.Trainer;

public class TrainerRunner {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Trainer train = new Trainer("yeshwanth");
		train.setLaptop(laptop);
		train.training();

	}

}
