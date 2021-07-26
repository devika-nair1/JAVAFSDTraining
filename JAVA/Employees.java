package com.ust.examples;

abstract class Emplo{
	private String name;
	private int Emplohour;
	
	void display() {
		System.out.println("Name is " +name+ "\n"+"Employee hour is"+Emplohour);
	}
	public Emplo () {
			}
	public Emplo(String name,int Emplohour) {
		this.name = name;
		this.Emplohour = Emplohour;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
	    return name;
	}
	
	public void setEmploHour(int EmplorHour) {
		this.Emplohour = Emplohour;
	}
 public int getEmplohour() {
	 return Emplohour;
 }
 
 abstract void salary(int x,int y);
	}
	
	public class Employees extends Emplo{
		Employees(){
		super();
		
	}
	 Employees(String name,int Emplohour){
		 super(name,Emplohour);
	 }

	 void salary(int days ,int total_sal) {
		 
		 if((total_sal/days)>500) {
			 System.out.println(" Good");
		 }
			 else {
				 System.out.println(" Not good");
			 }
	 
	 }	 	 
	 	 
	public static void main(String[] args) {
		
		Employees e1 = new Employees("Devika", 20);
				e1.display();
		Employees e2 = new Employees();
		        e2.setName("Krishna");
		System.out.println(e2.getname());
		        e2.salary(40,000);

	}

}
