package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;
	
	
	
	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	@Override
    public boolean equals(Object o) {
        if (o == this) { 
            return true; 
        } 
  
        if (!(o instanceof Wheel)) { 
            return false; 
        } 
        Wheel c = (Wheel) o; 
        return (this.brand.equals(c.brand) &&  (this.diameter == c.diameter));
       
    } 
}
