package com.ust.examples;
//credit class is super class

class CreditCards{
	protected String cardName; // instance variable
	private int expiryDate;
	private float creditBalance;
	
	CreditCards(){
		cardName = "Devika";
		expiryDate = 05/03/2023;
		creditBalance = 25000; 
	}

	 void checkCardBalance() {
		 if(creditBalance>=40000)
		 {
			 System.out.println("Sufficient balance");
		 }
		 	
		 else {
			 System.out.println("Not much balance");
		 }
	 }
	
	 void makePayment() {
		 
	 }	 
}
// visa is a sub class

class Visa extends CreditCards{
	 
	float interestRate;
	float creditLimit;
	
	Visa (String x,int y,float z){
		super();				
	}
	
	void checkDiscounts() {
		System.out.println("Many discounts will be provided");
	}}
// master card is also a subclass
class MasterCard extends CreditCards{
	
	void checkPaymentOpyions()
	{
		System.out.println("Online Payment mode is available");
	}
}	 
public class Example22 {
	public static void main(String[] args) {
		Visa v = new Visa("Devika",1231,30000.56f);
		
		v.checkCardBalance();	
	}}
