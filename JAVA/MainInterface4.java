package com.ust.examples;

interface Polygon{
	void getArea(int length,int breadth);
	
}
class Rectangle2 implements Polygon{
	public void getArea(int length,int breadth) {
		System.out.println("The area of rectangle is " +(length*breadth));
	}
}
class Triangle implements Polygon{
	public void getArea(int length,int breadth) {
		System.out.println("The area of triangle is " +(0.5* (length*breadth)));
	}
}
public class MainInterface4 {

	public static void main(String[] args) {
		Rectangle2 r2 = new Rectangle2();
		r2.getArea(8, 5);
		Triangle t1 = new Triangle();
		t1.getArea(10, 5);
		

	}

}
