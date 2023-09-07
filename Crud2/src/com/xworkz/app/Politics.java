package com.xworkz.app;

public class Politics {
	String[] ref = new String[10];
	int pos;
	
	
	
	public void conect(String name) {
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<10) {
			this.ref[pos] = name;
			System.out.println("The item name"+ name +"position"+ pos );
			System.out.println("it is valid");
			pos++;
			
		}else {
			System.err.println("it is not valid");
		}
		
	}
	
	public static void main(String[] args) {
		Politics pol  = new Politics();
		pol.conect("ONION");
	
		
		
	}

}
