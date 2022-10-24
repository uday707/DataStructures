package org.eric.ds.ch06.abstractBiaAbstractClass;

public class PetrolCar extends Car {

	public PetrolCar(String carType) {
		super(carType);
	}

	@Override
	void speedUp() {
		System.out.println("Speed up the Petrol car");
	}

	@Override
	void slowDown() {
		System.out.println("Slow Down the Petrol car");
	}

	@Override
	void turnRight() {
		System.out.println("Turn right the Petrol car");
	}

	@Override
	void turnLeft() {
		System.out.println("Turn left the Petrol Car");
	}
}
