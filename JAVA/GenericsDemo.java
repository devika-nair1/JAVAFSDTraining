package com.ust.examples;

import java.util.List;
import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		int value = 5;
		List values = new ArrayList();
		 values.add(7);
		 values.add("Devika");
		 
		 int i = Integer.parseInt(values.get(1).toString());
		 System.out.println(i);

	}

}
