package com.ust.example;

import java.util.function.BiFunction;  
class Multiplication{  
   public static int multiply(int a, int b){  
	return a*b;  
   }  
}  
public class Example6 {  
   public static void main(String[] args) {  
	BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
	int pr = product.apply(11, 5);  
	System.out.println("Product of given number is: "+pr);  
   }  
}