package com.xworkz.finalKeyword;

public class Game {

	public final String name;
	public final int players;
	public final double cost;

	//defaule Constructor using final keyword in variable declararion
	public Game() {
		this.name="yashu";
		this.players=100;
		this.cost=11.99;
		
	}
	public Game(String name,int players,double cost)
	{
		this.name=name;
		this.players=players;
		this.cost=cost;
	}
	
	
	

	

}
