package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addFrontWheel(Wheel wh) {
		this.wheels.add(wh);
	}
	public void addRearWheel(Wheel wh) {
		this.wheels.add(wh);
	}

}
