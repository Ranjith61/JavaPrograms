package com.inbuit;

public class StringBufferRunner {
	
	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer();
		StringBuffer ref = buf.append(false);
		System.out.println(ref);
		
		StringBuffer ref1 = buf.append('S');
		System.out.println(ref1);
		
		StringBuffer ref2 = buf.append(82);
		System.out.println(ref2);
		
		StringBuffer ref3 = buf.append(98555);
		System.out.println(ref3);
		
		StringBuffer app = buf.append("Ranjith");
		System.out.println(app);
			
	}

}
