package com.ust.examples;
/* About String
 * 
 */

public class Example9 {

	public static void main(String[] args) {
		String str = "hello ";
		
		String str1 = "hello";
		
		str = "hi";		
		System.out.println(str);
		
		System.out.println(str.concat(str1));		
		System.out.println(str1.charAt(1));
		System.out.println(str.length());		
		System.out.println(str1.substring(3));	
		System.out.println(str.trim());	
		System.out.println(str1.valueOf(false));
		System.out.println(str.isEmpty());		
		System.out.println(str.join(str1, "World "," Hey "));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		

	
		
		
		
		
	}

}
