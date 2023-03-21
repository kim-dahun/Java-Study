package edu.java.inheritance08;

public class Rectangle extends Shape {
	
	// field
	private double width;
	private double height;

	
	//constructor
	public Rectangle(String type, double width, double height) {
		super(type); // 상위 클래스의 argument를 갖는 생성자를 명시적 호출.
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	
	//method
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

}
