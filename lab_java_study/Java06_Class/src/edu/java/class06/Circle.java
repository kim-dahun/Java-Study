package edu.java.class06;

public class Circle {
	//field - 객체 속성
	double radius; // 원의 반지름
	double pi = 3.14;
	int i = 2;
	
	// 생성자 - 객체 속성을 초기화
	// (1) 기본 생성자
	// (2) argument 1개를 갖는 생성자
	public Circle(){
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	// 메서드 - 객체의 기능
	// (1) printfInfo - 원의 반지름 정보를 출력
	public void printInfo() {
		System.out.println("반지름 : " + this.radius);
	}
	// (2) perimeter - 원의 둘레 길이 ( 2 * 3.14 * 반지름 ) 을 리턴
	public double perimeter() {
		double result = pi * 2 * radius;
		
		return result;
		
	}
	// (3) area - 원의 넓이(3.14 * 반지름 * 반지름 ) 을 리턴.
	public double area() {
		double result = pi;
		for (int i=1; i<=2; i++) {
			result*=radius;
		}
		
		return result;
	}
	

	
	
}
