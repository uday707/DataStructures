package org.eric.ds.ch06.abstractBiaAbstractClass;

public class Main {

	public static void main(String[] args) {
	Car electricCar = new ElectricCar("BMW");
	Car petrolCar = new PetrolCar("Audi");
	
     	System.out.println("Driving the electric car: " + electricCar.getCarType() + "\n");
     	electricCar.speedUp();
     	electricCar.slowDown();
     	electricCar.turnLeft();
     	electricCar.turnRight();
     	
     	
     	System.out.println("\nDriving the Petrol car: " + petrolCar.getCarType() + "\n");
     	petrolCar.speedUp();
     	petrolCar.slowDown();
     	petrolCar.turnLeft();
     	petrolCar.turnRight();
	}
}
