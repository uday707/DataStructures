package org.eric.ds.ch06.abstractBiaAbstractClass;

public abstract class Car {

	private final String carType;
	
	//abstract class can have constructor
	public Car(String carType) {
		this.carType = carType;
	}
	
	// these are the abstract methods
	abstract void speedUp();
	abstract void slowDown();
	abstract void turnRight();
	abstract void turnLeft();
	
	// this is the concrete method
	public String getCarType() {
		return this.carType;
	}
}
