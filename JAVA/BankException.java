package com.ust.examples;

public class BankException extends Exception {
	
	static String message ="error";
		BankException(String message){
	super(message);
	}
	
	

	public static void main(String[] args) throws BankException{
		if(message.equals("error")) {
			System.out.println("error message");
		}
		else 
			throw new BankException("Bank Exception");
		
		
		
	}

}
