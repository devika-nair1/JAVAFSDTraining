package com.ust.example;

import java.util.*;  
public class Example4{  
    public static void main(String[] args) {       
       List<String> list=new ArrayList<String>();  
       list.add("Devika");         
       list.add("Niya");       
       list.add("Irin");         
       list.add("Feba");         
       list.add("Anjali");                
       list.forEach(          
           // lambda expression        
           (names)->System.out.println(names)         
       );     
    }  
}