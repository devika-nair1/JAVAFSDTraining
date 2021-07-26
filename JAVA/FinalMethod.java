package com.ust.examples;
class Base{
	final void display() 
	{
		System.out.println("base method called");
	}
}
class Derived extends Base
{
	//void display()
	{
	    System.out.println("base method called");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		Derived d = new Derived();
		d.display();

	}

}
