package com.ust.examples;
public class Employee1
{
		String fName;
	String lName;
	String city;
	String address;
	String dob;
	float salary;
	
	Employee1(String a,String b,String c,String d,String e,float f){
		
		fName = a;
		lName = b;
		city = c;
		address = d;
		dob = e;
		salary = f;
	}
	
	void Display(){
		
		System.out.println(fName+ " " + lName+ " "  + city+ " " + address + " "  + dob+ " " + salary + " ");
	}

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Devika","Nair,"," Kottayam ","No:4 Apartment","31/07/97",27000.0f);
		Employee1 e2 = new Employee1("Irin","George,"," Thiruvalla ","No:8 Apartment","08/09/97",30000.0f);
		Employee1 e3 = new Employee1("Niya","Francis,"," Kottayam ","No:12 Apartment","15/10/1998",35000.0f);
		Employee1 e4 = new Employee1("Feba","Kurian,"," Kollam ","No:7 Apartment","30/12/1997",40000.0f);
		Employee1 e5 = new Employee1("Anjali","Sreekumar,"," Kollam ","No:22 Apartment","07/08/1997",35000.0f);
		
		Employee1 array[] = new Employee1 [5];
		array[0] = new Employee1("Devika","Nair,"," Kottayam ","No:4 Apartment","31/07/97",27000.0f);
		array[1] = new Employee1("Irin","George,"," Thiruvalla ","No:8 Apartment","08/09/97",30000.0f);
		array[2] = new Employee1("Niya","Francis,"," Kottayam ","No:12 Apartment","15/10/1998",35000.0f);
		array[3] = new Employee1("Feba","Kurian,"," Kollam ","No:7 Apartment","30/12/1997",40000.0f);		
		array[4] = new Employee1("Anjali","Sreekumar,"," Kollam ","No:22 Apartment","07/08/1997",35000.0f);
			
		
	for(Employee1 e:array) {
		
		System.out.println(e.fName+e.lName+e.city+e.address+e.dob+e.salary);
	}	
				/*e1.Display();
		e2.Display();
		e3.Display();
		e4.Display();
		e5.Display(); */

	}

}
