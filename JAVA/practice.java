package com.ust.examples;
class Bank{
	private int accountNo;
	private String accountName;
	private float accountBalance;
	
     void printBankdetails() {
		System.out.println(accountNo+ " \n"+accountName+" \n"+accountBalance);
		
	}	
	protected void insertBankData(int x,String y,float z) {
		accountNo = x;
		accountName = y;
		accountBalance = z;
	}
}
class practice {
	
	public static void main(String[] args) {
	Bank p1 = new Bank();
	p1.insertBankData(12345, "Devika", 20000);
		p1.printBankdetails();

	}

}
