package com.ust.examples;
// Interface

interface Animalnew{
	public void animalSound();
	public void sleep();
}

class Pig implements Animalnew{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	
	public void sleep() {
		System.out.println("Zzz");
	}
}

public class InterfaceMain {

	public static void main(String[] args) {
	Pig myPig = new Pig();
	myPig.animalSound();
	myPig.sleep();
	

	}

}
