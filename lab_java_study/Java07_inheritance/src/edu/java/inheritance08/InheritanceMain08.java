package edu.java.inheritance08;

public class InheritanceMain08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스는 생성자를 호출할 수 없음. 객체 생성이 불가능.
		// Shape shape = new Shape("직사각형");
		Circle cir1 = new Circle("원",7.12312);
		cir1.draw();
//		Rectangle rect1 = new Rectangle("직-사각형",15.132,8.3841);
//		rect1.draw();
//		Rectangle rect2 = new Rectangle("정-사각형",15.132,15.132);
//		rect2.draw();
//		System.out.printf("rect1의 넓이는 rect2의 약 %d％", (int)(rect1.area()/rect2.area()*100));
		
		Shape[] shapes = {new Rectangle("직사각형", 3.12, 4.5), new Circle("원",7.13)};
		
		for(Shape x : shapes) {
			x.draw();
		}
	}

}
