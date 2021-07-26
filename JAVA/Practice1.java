package com.ust.examples;

class mark{
	int a = 9;
	int b = 18;
	 void m1(){
		 a = 10;
		 b = 20;
		  }
}
 class demo{
	 static void m1(mark[] e) {
		 e[1].m1();
	 }
 }
 
 public class Practice1{
	 
 	public static void main(String[] args) 
 	{
 		mark[] ex = {new mark(), new mark(), new mark()};
 		demo.m1(ex);
 		for(int i = 0;i<ex.length;i++) {
 			System.out.println(ex[i].a+ "\t");
 			System.out.println(ex[i].b+ "\n");
 		} 	
	}

}
