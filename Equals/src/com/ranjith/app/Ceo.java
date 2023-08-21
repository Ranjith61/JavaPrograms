package com.ranjith.app;

public class Ceo {
	private String name;
	private int age;
	private String company;
	private int yearsInPosition;
	private double salary;
	private String Experience;
	
	public Ceo() {
		
	}

	public Ceo(String name, int age, String company, int yearsInPosition, double salary, String experience) {
		super();
		this.name = name;
		this.age = age;
		this.company = company;
		this.yearsInPosition = yearsInPosition;
		this.salary = salary;
		Experience = experience;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + ", company=" + company + ", yearsInPosition=" + yearsInPosition
				+ ", salary=" + salary + ", Experience=" + Experience;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in CEO");
		if (obj !=null) {
			System.out.println("obj is not null");
			if(obj instanceof Ceo) {
				System.out.println("object is of Ceo");
				Ceo c = (Ceo) obj;
				if(c.name.equals(this.name)&& c.age == this.age) {
					System.out.println("object and properties are same");
					return true;
				}else {
					System.out.println("object and properties are not same");
				}
			}else {
				System.out.println("object is not of ceo");
			}
		}else {
			System.out.println("obj is null");
		}		
		return false;
	}
	

}
