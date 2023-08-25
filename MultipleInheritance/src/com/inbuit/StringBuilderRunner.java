package com.inbuit;

public class StringBuilderRunner {
	public static void main(String[] args) {
		StringBuilder build = new StringBuilder("Hello");
		System.out.println(build);
		
		StringBuilder ref = build.reverse();
		System.out.println(ref);
		
		int ref1 = ref.length();
		System.out.println(ref1);
		
		int cap = ref.capacity();
		System.out.println(cap);
		
		StringBuilder str = ref.append(2002);
		System.out.println(str);
		}

}
