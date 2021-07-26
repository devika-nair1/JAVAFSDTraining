package com.ust.examples;


class StudentNotFoundException extends Exception{
	public StudentNotFoundException(String message) {
		super(message);
	}
}


class Student3 {
	Student3(){
		
}
}

 class StudentManager {

	public Student3 find(String studentID)throws StudentNotFoundException{
		if(studentID.equals("123456")) {
			return new Student3();
		}
		else {
			throw new StudentNotFoundException("Could not find student with ID"+studentID);
			
			}
		}
			}
		
public class Exception9 {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		try {
			Student3 student = manager.find("0000001");
		}
		
catch(StudentNotFoundException ex){
		System.err.print(ex);
	}
	}
}

	


