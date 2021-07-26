package com.ust.examples;
import java.io.File;
/*
 * File operations
 */
import java.io.IOException;

public class Example11 {

	public static void main(String[] args) throws IOException {
		File f = new File ("C:\\Users\\ustjava21\\Sample.txt");
		if(f.createNewFile()) {
			System.out.println("new file is created");
			}else {
				System.out.println("file is already exists");
			}

	}

}
