package com.ust.examples;

 interface Emp
 {
	 int id = 2101;
	 void getid();
 }
 class ImpClass implements Emp
 
 {
	 @Override
	 public void getid()
	 {
		 System.out.println("Employee id is " +id);
	 }
 }

public class DemoNew {

	public static void main(String[] args) {
	
		ImpClass ob = new ImpClass();
		ob.getid();

	}

}
