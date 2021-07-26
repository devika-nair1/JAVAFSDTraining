package com.ust.examples;

interface Emp1
{
	 int id = 2101;
	 void getid();
}
public class DemoNew1
{

	public static void main(String[] args) {
		Emp1 ob = new Emp1() {
			@Override
			public void getid() 
			{
				System.out.println("Employee id is " +id);
			}
		};
		
		ob.getid();
		

	}

}
