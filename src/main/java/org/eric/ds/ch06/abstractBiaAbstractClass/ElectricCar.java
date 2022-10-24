package org.eric.ds.ch06.abstractBiaAbstractClass;

public class ElectricCar extends Car {

	public ElectricCar(String carType) {
		super(carType);
	}
	
	@Override
	void speedUp() {
	    System.out.println("speed up the electric car");
	}

	@Override
	void slowDown() {
		System.out.println("slow down the electric car");

	}

	@Override
	void turnRight() {
	   System.out.println("Turn right the electric car"); 
    }

	@Override
	void turnLeft() {
		System.out.println("Turn left the electric car");
	}

}
