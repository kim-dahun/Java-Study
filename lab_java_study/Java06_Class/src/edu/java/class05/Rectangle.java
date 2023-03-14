package edu.java.class05;

// 직사각형
public class Rectangle {
	//field - 객체 속성
	double width;
	double height;
	
	// 생성자 - 필드초기화
	Rectangle(){
		
	}
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	// 메서드 - 객체의 기능
	// (1) perimeter - 직사각형의 둘레 길이를 리턴.
	public double perimeter() {
		double perimeter = (width+height)*2;		
		
		return perimeter;
	}
	// (2) area - 직사각형의 넓이를 리턴.
	public double area() //137.12323*10 = 1371.2323 => 1371
	{
		double area = Math.round(width*height*1000)/1000.0;
		
		
		
		return area;
	}
}
