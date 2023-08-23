package com.xworkz.interfaces.mainRunner;

import com.xworkz.interfaces.Temple;
import com.xworkz.interfaces.main.HanumanTemple;

public class TempleRunner {
		public static void main(String[] args) {
			Temple temple = new HanumanTemple();
			temple.name("Annapurnashwari Temple");
			temple.entryFee(500);
			temple.prasadamTime(1);
			
		}
}
