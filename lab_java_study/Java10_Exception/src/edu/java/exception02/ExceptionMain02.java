package edu.java.exception02;

import java.util.Scanner;

/*
 * try-catch 구문을 사용한 예외 처리:
 * 
 * try {
 * 		(1) 실행할 코드들.
 * } catch ( Exception 타입 변수 선언) {
 * 		(2) 예외가 발생했을 때 실행할 코드
 * } finally {
 * 		(3) 예외 발생 여부와 상관없이 항상 실행할 코드들.
 * 		(try 블록이 모두 끝났을 때 또는 catch 블록이 모두 끝났을 때 실행할 코드들)
 * }
 * 
 * 
 * - 예외가 발생하지 않은 경우 : (1) -> (3)
 * - 예외가 발생하는 경우: (1) 실행 중에 예외 발생 -> (2) -> (3)
 * - 발생한 예외를 catch할 수 없으면, catch 블록이 실행되지 못하고, 프로그램은 비정상적으로 종료됌.
 * - catch 블록은 발생할 수 있는 예외 종류에 따라서 여러 개를 작성할 수도 있음.
 * - finally 블록은 선택 사항(필수가 아님).
 * 
 * 예외 클래스의 상속관계:
 * Object 
 * |__ Throwable
 * 		|__ Exception
 * 			|__ RunTimeException, ...
 * 				|__ArithmeticException, NullpointerException, ArrayIndexOutOfBoudsException, ...
 * 
 * - catch 블록이 여러 개일 경우 하위 타입의 예외들을 먼저 catch하고, 상위 타입의 예외들은 나중에 catch 해야 함.
 */

public class ExceptionMain02 {

	public static void main(String[] args) {
		// 정수를 입력받아서 나누기 결과를 출력. ( 모든 예외 케이스를 찾아서 제외하고 출력 )
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("X >>");
			int x = Integer.parseInt(scan.nextLine());
			System.out.println("Y >>");
			int y = Integer.parseInt(scan.nextLine());
			
			int result = x/y;
			
			
			System.out.println("x / y의 몫 = " + result);
		} catch (ArithmeticException e) {
			System.out.println("y는 0이 될 수 없습니다.");
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) { // Exception 클래스의 모든 하위 타입 예외들을 처리할 수 있음.
			e.printStackTrace();
		}
		

		System.out.println("프로그램 정상종료");
		
	}

	
	
	
}
