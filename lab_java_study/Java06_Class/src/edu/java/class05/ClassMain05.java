package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(3.14159,3.28588); // 인수 2개 받는 생성자
		Rectangle r2 = new Rectangle(); // 기본 생성자
		
		System.out.printf("가로 : %f , 세로 : %f\n",r1.width,r1.height);
		
		System.out.println("r1 넓이 : " + r1.area());
		System.out.println("r1 둘레 : " + r1.perimeter());
		
		r2.height = 3.3;
		r2.width = 3.3;
		System.out.println("r2 넓이 : " + r2.area());
		System.out.println("r2 둘레 : " + r2.perimeter());
	}

}
