package edu.java.inheritance08;

public class Circle extends Shape {

	// field
	private double radius; // 원의 반지름
	private double pi; // 원주율
	
	//constructor
	public Circle(String type, double radius) {
		super(type);
		this.pi = Math.PI;
		this.radius = radius;
	}
	
	
	//method
	public double area() {
		
		return pi*radius*radius;
	}
	
	public double perimeter() {
		return pi*2*radius;
	}

}
