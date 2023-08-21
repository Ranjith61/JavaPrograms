package com.ranjith.app;

public class Minister {
	private String name;
	private int age;
	private int salary;
	private String educationalBackground;
	private int term;
	private String party;
		
	public Minister() {
		
		super();
	}

	public Minister(String name, int age, int salary, String educationalBackground, int term, String party) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.educationalBackground = educationalBackground;
		this.term = term;
		this.party = party;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + ", salary=" + salary + ", educationalBackground="
				+ educationalBackground + ", term=" + term + ", Party=" + party;	
	
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in mechanic");

		if(obj !=null)
		{
			System.out.println("object is not null");
			if(obj instanceof Minister) {
				System.out.println("object is instance of minister");
				Minister min = (Minister) obj;
				if(min.name.equals(this.name)) {
					System.out.println("object and properties are same");
					return true;	
				}else {
					System.err.println("object and properties are not same");		
				}
			}else {
				System.out.println("object is not of Minister");
			}
		}else {
			System.out.println("obj is null");			
		}	
		return false;
	}
	
	
	
	
}
