package com.ust.examples;

import java.util.*;

public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner sct = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter the number");
		num = sct.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
		
	}

}
