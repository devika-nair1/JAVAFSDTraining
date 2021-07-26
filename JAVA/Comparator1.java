package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

class Student123{
	int id;
	String name;
	int age;
	Student123(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
}
	class NameComparator implements Comparator{
		
	
	public int compare(Object obj1,Object obj2)
	{
		Student123 s1 = (Student123)obj1;
		Student123 s2 = (Student123)obj2;
		return s1.name.compareToIgnoreCase(s2.name);
		
	}
	
}

public class Comparator1 {

	public static void main(String[] args) {
		
		
		ArrayList  arr = new ArrayList();
		
		arr.add(new Student123(1,"Devika",23));
		arr.add(new Student123(2,"Krishna",24));
		arr.add(new Student123(3,"Aparna",25));
	
		System.out.println("Sorting by Name");
		
		Collections.sort(arr,new NameComparator());
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			Student123 st = (Student123)itr.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
			
			
		}
		

	}}



