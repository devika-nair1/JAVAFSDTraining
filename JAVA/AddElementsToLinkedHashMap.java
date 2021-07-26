package com.ust.examples;

import java.util.*;
public class AddElementsToLinkedHashMap {

	public static void main(String[] args) {
		
        LinkedHashMap<Integer, String> hm1
            = new LinkedHashMap<Integer, String>();
  
        
        hm1.put(3, "Hello");
        hm1.put(2, "I am");
        hm1.put(1, "Devika");
  
        System.out.println("Mappings of LinkedHashMap : "
                           + hm1);
    }
}

