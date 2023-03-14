package edu.java.class06;

import java.util.Scanner;

public class ClassMain06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("cir1 의 반지름(radius)을 입력하세요 >>>");
		double radius = scan.nextDouble();
		
		Circle cir1 = new Circle(); // 기본 생성자 호출
		Circle cir2 = new Circle(7); // argument 1개 생성자 호출
		
		cir1.radius = radius;
		
		System.out.println("cir1");
		cir1.printInfo();
		System.out.printf("둘레 : %f\n",cir1.perimeter());
		System.out.printf("넓이 : %f\n ",cir1.area());
		
		System.out.println("====================================");
		
		System.out.println("cir2");
		cir2.printInfo();
		System.out.println(cir2.getClass().getSimpleName() + "둘레 : " + cir2.perimeter());
		System.out.println("넓이 : " + cir2.area());
		
		System.out.println("====================================");
		
		// Stack : 지역 변수들이 만들어지는 위치
		// Heap : 
		
	}

}
