package com.example.Runner;

import java.lang.System.Logger;

public class SystemRunner {
	public static void main(String[] args) {
		
		long sys = System.currentTimeMillis();
		System.out.println(sys);
		
		String ref = System.clearProperty("name");
		System.out.println(ref);
		
		int name = System.identityHashCode(ref);
		System.out.println(name);
		
		String env = System.getenv("Xworkz");
		System.out.println(env);
		
		Logger ref1= System.getLogger("Names");
		System.out.println(ref1);
	}

}
