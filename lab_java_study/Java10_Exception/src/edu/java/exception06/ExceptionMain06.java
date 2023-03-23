package edu.java.exception06;

import java.util.Scanner;

public class ExceptionMain06 {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO inputInteger() 메서드 테스트 코드
		ExceptionMain06 app = new ExceptionMain06();
		int x = app.inputInteger();
		
		System.out.println("x = " + x);

	}

	public int inputInteger() {
		// TODO Scanner를 통해서 입력받은 정수를 return.

		// 몇 번 입력만에 제대로된 정수가 입력되서 리턴이 완료 되는지 체크
		int count = 0;
		int x = 0;
		boolean run = true;
		for (count = 0; run; count++) {

			System.out.println("정수를 입력하세요.");
			try {
				x = Integer.parseInt(scanner.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			run = false;
		}
		System.out.println(count + " 회 만에 제대로 입력되었습니다.");

		return x;
		
		// 재귀 메서드로 반복시키기
		
//		int x = 0;
//	
//		try {
//			
//			System.out.println("정수입력 >>>");
//			x = Integer.parseInt(scanner.nextLine());
//		} catch (NumberFormatException e) {
//			System.out.println("오입력");
//			
//			return inputInteger(n+1);
//		}
//		
//		System.out.println(n + " 횟수만에 완료");
//		
//		return x;
	}

}
