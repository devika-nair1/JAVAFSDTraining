package com.ust.examples;
class Car0{
	private String carName;
	private String carType;
	
	public Car0(String name, String type) {
		this.carName = name;
		this.carType = type;
	}
	 private String getCarName() {
		 return this.carName;
		 	 }
	
	class Engine{
		String engineType;
		void setEngine() {
			
			if(Car0.this.carType.equals("4WD")) {
				
				if(Car0.this.getCarName().equals("Crysler")) {
			this.engineType = "Smaller";
				}else {
					this.engineType = "Bigger";
				}
			}else {
					this.engineType = "Bigger";
				}
			}
		
	String getEngineType(){
		return this.engineType;
	}
	}	}

public class Example46 {

	public static void main(String[] args) {
		
		Car0 car1 = new Car0("Mazda","8WD");
		Car0.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8WD =" +engine.getEngineType());
		
		Car0 car2 = new Car0("Crysler","4WD");
		Car0.Engine c2engine = car2.new Engine();
		c2engine.setEngine();
		System.out.println("Engine Type for 4WD =" +c2engine.getEngineType());
				
	}
		
	}


