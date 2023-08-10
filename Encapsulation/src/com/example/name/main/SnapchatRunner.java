package com.example.name.main;

import com.example.name.SnapChat;

public class SnapchatRunner {

	public static void main(String[] args) {
		 SnapChat snap = new SnapChat();	 
		 System.out.println(snap.getTotalstreaks());
		 System.out.println(snap.getColour());
		 
		 System.out.println("============");
		 
		 snap.setView("once");
		 snap.setTotalstreaks(500);
		 snap.setColour("Yellow");
		 snap.setStreaklost(35);
		 snap.setFounder("Evan Spiegal");
		 snap.setCalls(true);
		 snap.setMessages(true);
		 snap.setStory("public");
		 snap.setCost(1000);
		 snap.setAcess("everyone");
		 snap.setYear(2001);
		 snap.setShape("Bell");
		 snap.setHasAi(true);
		 snap.setReplay(true);
		 
		 
		 
		 System.out.println("view: "+snap.getView());
		 System.out.println("Total streaks: "+snap.getTotalstreaks());
		 System.out.println("colour: "+snap.getColour());
		 System.out.println("Straks lost: "+snap.getStreaklost());
		 System.out.println("Founder: "+snap.getFounder());
		 System.out.println("Take the calls: "+snap.isCalls());
		 System.out.println("Text messages: "+snap.isMessages());
		 System.out.println("Story seen: "+snap.getStory());
		 System.out.println("Cost :"+snap.getCost());
		 System.out.println("Acess "+snap.getAcess());
		 System.out.println("Year :"+snap.getYear());
		 System.out.println("Shape :"+snap.getShape());
		 System.out.println("Replay :"+snap.isReplay());
	}

}



