package com.xworkz.finalKeyword;

public class GameRunner {
	public static void main(String[] args) {
		Game game=new Game();
		System.out.println(game.name);
		System.out.println(game.cost);
		System.out.println(game.name);
		System.out.println(game.players);
		
		Game game1=new Game();
		System.out.println(game1.players);
		Game game2=new Game("yashu", 4, 7);
		System.out.println(game2.cost);
		System.out.println(game2.name);
		System.out.println(game2.players);
		
	}

}
