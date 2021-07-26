package com.ust.examples;

//Example of inner class

public class Example44 {
	 int x = 5;	
	
	private void display() {
		System.out.println("outer class");
		
	}	
public class Inner{
	 int y;
	 //x=4;
	 
	Inner(int y){
		this.y=y;
	}
	
		void display() {
			System.out.println("example of inner class");
		}
	}

	public static void main(String[] args) {
		
		Example44.Inner e1 = new Example44().new Inner (6);
		
		Example44 e2 = new Example44();
		e2.display();
		e2.x = 5;
		e1.display();
		System.out.println(e2.x);
		
	     e1.display();
	}

}
