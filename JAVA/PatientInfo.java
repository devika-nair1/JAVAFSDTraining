package com.ust.examples;


class TestPatient{
	private String name;
	private int age;
	private boolean vaccine;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVaccine() {
		return vaccine;
	}
	public void setVaccine(boolean vaccine) {
		this.vaccine = vaccine;
		
		
		if(vaccine==true) {
			System.out.println("Good ");
		}
		else {
			System.out.println("Better to get vaccinates as soon as possible!");
		}
		
		
	}

}
public class PatientInfo {

	public static void main(String[] args) {
		
		TestPatient p = new TestPatient();
		p.setVaccine(false);
		System.out.println(p.isVaccine());	
		

	}

}
