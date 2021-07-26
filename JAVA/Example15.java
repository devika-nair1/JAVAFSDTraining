package com.ust.examples;
/*
 * Average Calculation
 */

public class Example15 {

	public static void main(String[] args) {
		int[] numbers= {2,-17,0,9,22,-25,22,4,8,12};
		int sum =0;
		Double average;
		//access all elements using for each loop
		//add eachh element in sum
		
		for(int number:numbers) {
			sum+=number;
				}
		//get the total nuumbers of elements
		int arrayLength = numbers.length;
		
		//calculate the average
		//convert the average from int to double
		
		average = ((double)sum/(double)arrayLength);
		
		System.out.println("Sum = "+ sum );
		System.out.println("Average =" + average );

	}

}
