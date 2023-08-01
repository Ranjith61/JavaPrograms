package com.xworkz.app;

public class Person {
	String name;
	int age;
	String place;
	
	
	public Person()
	{
		System.out.println("invoking main in person");
	}
	
	public Person(String name)
	{
		this.name=name;
		System.out.println("printing the person name");
	}
	
	public Person(String name,int age)
	{
		this(name);
		this.age=age;
		System.out.println("printing the name and age values");
	}
	
	public Person(String name,int age,String place)
	{
		this(name,age);
		this.place=place;
		System.out.println("printing the name and age ,place values");
	}
	
	public void printInfo()
	{
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.place);
	}
}
