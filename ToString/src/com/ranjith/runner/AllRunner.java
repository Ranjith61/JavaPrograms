package com.ranjith.runner;

import com.ranjith.app.Cave;
import com.ranjith.app.Flag;
import com.ranjith.app.Kerchief;
import com.ranjith.app.Logo;
import com.ranjith.app.Pendant;

public class AllRunner {
	public static void main(String[] args) {
		
	System.out.println("invoking main in FlagRunner");

	Flag flag = new Flag("Orange White Green", 5, true);
	System.out.println(flag);

	Flag flag1 = new Flag("White", 10, false);
	System.out.println(flag1);

	Flag flag2 = new Flag("Green", 3, false);
	System.out.println(flag2);
	
	System.out.println("----------------");
	System.out.println("Invoing main in caveRunner");
	Cave cave = new Cave("Crystal Gotto", "Bengalore", false, 120.3, 110.1, false, "LimeStone", "StandAlone", 320, 1500);
	System.out.println(cave);

	Cave cave1 = new Cave("Echo Cavern", "West Bengal", true, 150.3, 90.1, true, "Lava Tube", "Part of System", 120, 1200);
	System.out.println(cave1);

	Cave cave2 = new Cave("DarkWater Abyss", "South East", true, 80.3, 100.5, false, "Ice cave", "StandAlone", 550, 1800);
	System.out.println(cave2);
	
	System.out.println("-----------------");
	
	System.out.println("invoking main in KercheifRunner");

	Kerchief kerchief = new Kerchief("Rodster", "Hand Kercheif", 100, "White", false, 20, false);
	System.out.println(kerchief);

	Kerchief kerchief1 = new Kerchief("Ramraj", "Hand Kercheif", 200, "Brown", true, 10, true);
	System.out.println(kerchief1);

	Kerchief kerchief2 = new Kerchief("Allen Solley", "Face Kercheif", 50, "Chocolate", true, 30, true);
	System.out.println(kerchief2);
	
	System.out.println("-----------------");
	
	System.out.println("invoking main in LogoRunner");

	Logo logo = new Logo("BoatThread", "mickel", "Black", true, "Earphpnes");
    System.out.println(logo);

    Logo logo1 = new Logo("TCS", "RatanTata", "Red", true, "Tata");
    System.out.println(logo1);

    Logo logo2 = new Logo("xworkz", "omkar", "Orange", false, "Xworkz");
    System.out.println(logo2);
    
    System.out.println("------------------");
    System.out.println("invoking main in PendantRunner");

	Pendant pendant = new Pendant("Eternal Blossem", "18K Gold", "Filigree Swirls", "Aqua Blue", 8, 10, "Emerald",
			"Rolo Chain", 10000, "karan", "Wedding", "India");
	System.out.println(pendant);

	Pendant pendant1 = new Pendant("Celestial Harmony", "Sterling Silver", "Lotus Mandala", "Rose Gold", 4, 15,
			"Sapphire", "Box Chain", 20000, "kumar", "Anniversary", "China");
	System.out.println(pendant1);

	Pendant pendant2 = new Pendant("Mystic Gem", "Rose Gold with Platinum", "Ancient Symbols", "Blue", 6, 12,
			"Opal", "Figaro Chain", 30000, "vivek", "Birthday", "Japan");
	System.out.println(pendant2);
    
	}

}

