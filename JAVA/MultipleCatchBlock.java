package com.ust.examples;
public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 50/0;
		}
		 catch(ArithmeticException e) {
			 System.out.println("Arithmetic Exception Occurs");
		 }
		catch(ArrayIndexOutOfBoundsException e1) {
			 System.out.println("ArrayIndexOutOfBoundsException Occurs");
		 }
		catch(Exception e)
		{
			System.out.println(" Exception....");
		}
		System.out.println("Remaining code");
	}

}
