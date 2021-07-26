package com.ust.examples;
class DemoClassnew{
	 public <T> void genericsMethod(T data) {
		 System.out.println("Generics Method:");
		 System.out.println("Data Passed:" +data);
	 }

	 }



public class GenericsClassDemo2 {

	public static void main(String[] args) {
		DemoClassnew demo = new DemoClassnew();
		demo.<String>genericsMethod("Java Programming");
		demo.<Integer>genericsMethod(25);
	}
}
 
	