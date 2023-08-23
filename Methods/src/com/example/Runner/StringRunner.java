package com.example.Runner;

public class StringRunner {
		public static void main(String[] args) {
			String ref = new String("Virat Kohli");
			System.out.println(ref);
			
			//charAt
			char ref1=ref.charAt(6);
			System.out.println(ref1);
			
			//concatination
			String str=ref.concat("Hello World");
			System.out.println(str);
			
			//compareTo
			int ref3 =ref.compareTo(str);
			System.out.println(ref3);
			
			//isEmpty
			boolean boo =ref.isEmpty();
			System.out.println("isEmpty = "+boo);
			
			//Upper case and lower case
			String upper =ref.toUpperCase();
			System.out.println(upper);
			
			String lower = ref.toLowerCase();
			System.out.println(lower);
			
			//length
			int len = ref.length();
			System.out.println(len);
			
			//stats with
			boolean pre = ref.startsWith("Hello");
			System.out.println(pre);
			
			//endsWith
			boolean suf = ref.endsWith("");
			System.out.println(suf);
			
			//isBlank
			boolean bla = ref.isBlank();
			System.out.println(bla);
			
			//indexOf
			int ind = ref.indexOf(str);
			System.out.println(ind);
			
			//trim
			String tri = ref.trim();
			System.out.println("Trim = "+tri);
			
			//equals
			boolean equ = ref.equals("Virat Kohli");
			System.out.println(equ);
			
			//equalsIgnoreCase
			boolean ign = ref.equalsIgnoreCase("Ram charan");
			System.out.println(ign);
			
			//substring
			String sub = ref.substring(2);
			System.out.println(sub);
			
			//split
			String street="3rd Main Road, Peenya , Bengaluru";
			String[] splited=street.split("a");			
			for (int i = 0; i < splited.length; i++) {
				String string = splited[i];
				System.out.println(string);
				
			//split overloaded
				String name ="Sachin Tendulkar";
				String[] split = name.split("a",2);
				for (int j = 0; j < split.length; j++) {
					String string2 = split[j];
					System.out.println(string2);
					
		   
			    			
					}
			    
				}
				
			}
		}
		



