package com.ust.examples;
/* Upcasting & Downcasting
 * 
 */

public class CastExample {

	public static void main(String[] args) {
	double num = 14.925;
	System.out.println(num);
	int n = (int)num; // down casting the double to int type
    System.out.println(n);
    int x = 85;
    double y = x;
    System.out.println(x);
    System.out.println(y);
    float f = (float)3.67;
    byte d = (byte)f;
    System.out.println(d);
    long e = 2995;
    float j = (float)e;
    System.out.println(j);
     
    
    int c =  4;
    String dbValue = String.valueOf(c);
    System.out.println(dbValue);
    
    dbValue = String.valueOf(e);
    System.out.println(dbValue);
    
    dbValue = String.valueOf(x);
    System.out.println(dbValue);
    
    dbValue = String.valueOf(num);
    System.out.println(dbValue);
    
	}

}
