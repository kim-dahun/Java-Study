package edu.java.conditional06;

import java.util.Random;

public class ConditionalMain06 {

	public static void main(String[] args) {

		// Random 타입의 변수 선언 및 초기화
		// 3과목 점수를 난수로 만들기
		// 합불 여부만 출력 ( 세 과목 점수 모두 40점 이상이면서, 평균이 60 이상 )
		// 나머지는 불합격
		
		Random r1 = new Random();
		
		int javaSc = r1.nextInt(101);
		int sqlSc = r1.nextInt(101);
		int htmlSc = r1.nextInt(101);
		
		int sum = javaSc + sqlSc + htmlSc;
		double avg = sum/3.0;
		
		String clear = (javaSc >= 40  && sqlSc >= 40 && htmlSc >= 40) && avg >= 60 ? "합격" : "불합격";
		
		System.out.println("Java 점수는 " + javaSc + "\nsql 점수는 " + sqlSc + "\nhtml 점수는 " + htmlSc);
		System.out.println("평균점은 " + avg + "점이고 " + clear + " 입니다");
		
		if ( javaSc >= 40 && sqlSc >=40 && htmlSc >= 40) {
			System.out.println("Java 점수는 " + javaSc + "\nsql 점수는 " + sqlSc + "\nhtml 점수는 " + htmlSc);
			System.out.println("과락이 아닙니다");
			if (avg >= 60) {
				System.out.println("평균 점수 " + avg + " 점으로 합격입니다");
			} else {
				System.out.println("평균 점수 " + avg + " 점으로 불합격입니다.");
			}
		} else {
			System.out.println("과락으로 인해 불합격입니다.");
		}
	}

}
