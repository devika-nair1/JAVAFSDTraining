package com.ust.example;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface{

    
    double getPiValue();
}


public class LambdaExample3 {

	public static void main(String[] args) {
	    MyInterface ref;
	       
	    ref = () -> 3.1415;
	    
	    System.out.println("Value of Pi = " + ref.getPiValue());
	    } 
	}
