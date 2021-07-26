package com.ust.examples;


import java.io.FileOutputStream;
public class FileExample2 {

	public static void main(String[] args) {
		try {
			/*FileInputStream input = new FileInputStream("C:\\Users\\ustjava21\\test01.txt");
			System.out.println("Data in the File:");
			int i = input.read();
			while (i !=1) {
				System.out.println((char)i);
				i=input.read();
			}
			input.close();*/
			
			String s = "output file";
			FileOutputStream  output = new FileOutputStream ("D:\\FileExample.txt");
			output.write(s.getBytes());
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
	}

}
