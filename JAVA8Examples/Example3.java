package com.ust.example;

interface StringConcat {

    public String sconcat(String a, String b);
}
public class Example3 {

   public static void main(String args[]) {
        
    	StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));
    }
}