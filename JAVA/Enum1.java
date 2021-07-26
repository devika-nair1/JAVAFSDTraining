package com.ust.examples;
import java.util.Hashtable;
import java.util.Enumeration;

public class Enum1 {

	public static void main(String[] args) {
		
		Enumeration names;
		String key;
		Hashtable<String,String> hashtable = new Hashtable<String,String>();
		hashtable.put("Key1", "Devika");
		hashtable.put("Key2", "Niya");
		hashtable.put("Key3", "Irin");
		hashtable.put("Key4", "Feba");
		hashtable.put("Key5", "Anjali");
		
		names = hashtable.keys();
		while(names.hasMoreElements()) {
			
		
		key = (String)names.nextElement();
		System.out.println("Key: "+ key +" & Value: "+ hashtable.get(key));
		
		}
	}

}
