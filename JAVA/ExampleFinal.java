package com.ust.examples;
/* 
 * Final method,Final Variable,Final Class
 */
public class ExampleFinal {
    int a;
    final int b;
    ExampleFinal(){
    	a = 7;
    	b = 2;
    }
    
    
    
  
	
	public static void main(String[] args) {
		// x is a local variable and is also final
		
		final int x;
		
		x = 10;
		System.out.println(x);

		ExampleFinal e = new ExampleFinal();
		System.out.println(e.a);
		System.out.println(e.b);
	    e.a = 3;
	    System.out.println(e.a); 
	
		}
	}
