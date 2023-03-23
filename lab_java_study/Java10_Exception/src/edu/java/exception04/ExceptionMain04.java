package edu.java.exception04;

import java.util.Scanner;

public class ExceptionMain04 {

	public static void main(String[] args) {
		// multi-catch 블럭 ( Java 7 버전부터 ):
		// 하나의 Catch 블럭에서 여러 개의 예외들을 처리하기 위한 문법.
		// catch(Exception1 | Exception2 | ... 변수이름 ) { ... }
		// multi-catch 블럭은 상속관계(super-sub 관계)에 있는 예외 클래스들은 함께 사용할 수 없음.

		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("X를 입력 >>> ");
			int x = Integer.parseInt(scan.nextLine());

			System.out.print("Y를 입력 >>> ");
			int y = Integer.parseInt(scan.nextLine());

			System.out.printf("%d / %d = %d\n", x, y, x / y);

		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
