package com.ust.example;

@FunctionalInterface
interface MyFunctionalInterface1 {

	
    public int incrementByFive(int a);
}
public class Example2 {

   public static void main(String args[]) {
        
    	MyFunctionalInterface1 f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
}