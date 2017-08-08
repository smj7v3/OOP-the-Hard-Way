package com.smj7v3.exercises;

public class Ex08_SphereCalc2 {
	
	double radius, area, volume;
	
	public void setRadius(double r) {
		radius = r;
		area = 4*Math.PI*r*r;
		volume = 4*Math.PI*Math.pow(r, 3)/3.0;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getSurfaceArea() {
		return area;
	}
	
	public double getVolume() {
		return volume;
	}

}
