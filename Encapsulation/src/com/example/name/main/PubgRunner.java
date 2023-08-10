package com.example.name.main;

import com.example.name.Pubg;

public class PubgRunner {
	public static void main(String[] args) {
		Pubg shot = new Pubg();
		
		shot.setPlayerName("Creul Freak");
		shot.setPlayerId("KDV212");
		shot.setLevel(12);
		shot.setMatchesPlayed(50);
		shot.setKills(233);
		shot.setWins(90);
		shot.setToptens(1);
		shot.setKdRatio(23);
		shot.setWinRatio(100);
		shot.setFavoriteWeapon("MK14");
		shot.setSquadMate1("rock");
		shot.setSquadMate2("krishna");
		shot.setPremiumPassSubscriber(true);
		shot.setRankedMatchPlayed(true);
		
		System.out.println("Player Name = "+shot.getPlayerName());
		System.out.println("Player Id = "+shot.getPlayerId());
		System.out.println("Level = "+shot.getLevel());
		System.out.println("Matches Played = "+shot.getMatchesPlayed());
		System.out.println("Kills = "+shot.getKills());
		System.out.println("Wins = "+shot.getWins());
		System.out.println("Top Tens = "+shot.getToptens());
		System.out.println("KD Ratio = "+shot.getKdRatio());
		System.out.println("Win Ratio = "+shot.getWinRatio());
		System.out.println("Favorite weapon = "+shot.getFavoriteWeapon());
		System.out.println("Squard Mate1 = "+shot.getSquadMate1());
		System.out.println("Squard Mate2 = "+shot.getSquadMate2());
		System.out.println("Premiumpass Subscriber = "+shot.isPremiumPassSubscriber());
		System.out.println("Ranked match Played = "+shot.isRankedMatchPlayed());
	
	}

}
