package com.ust.examples;

class GenericsClassD <T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generic class.");
		
	}
}

public class GenericsClasDemo3 {

	public static void main(String[] args) {
		GenericsClassD<Number> obj = new GenericsClassD<>();
		obj.display();
	}

}
