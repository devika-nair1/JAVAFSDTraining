package com.ust.examples;
public class NestedInnerClass {
	
	class Inner{
		public void show() {
			System.out.println("In a nested class method");
		}
	}

	public static void main(String[] args) {
	     NestedInnerClass.Inner in = new NestedInnerClass().new Inner();
	     in.show();

	}

}
