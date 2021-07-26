package com.ust.examples;
/*This example depicts the usage of local static and instance variable
 * 
 */

public class Example1 {
	String name;//instance variable
	Float price;
	static int count;
	

	public static void main(String[] args) {
		int age = 10;
		System.out.println(age);
		Example1 e = new Example1();
		e.name = "Devika";
		count = 7;
		System.out.println(age);

	}

}
