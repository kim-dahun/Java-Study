package edu.java.exception05;

/*
 *  Java의 예외(Exception) 클래스
 *  
 *  1. Unchecked Exception : 
 *  - 예외 처리를 하지 않아도(try-catch 문장을 사용하지 않아도) 컴파일 에러가 발생하지 않는 예외 클래스. 
 *  - Runtime Exception의 하위 클래스들.
 *  - (EX) NumberFormatException, NullpointerException, ...
 *  
 *  2. Checked Exception
 *  - 반드시 예외 처리를 해야만 하는 예외 클래스들.
 *  - try-catch 문장을 사용하지 않거나, throws 선언문을 사용하지 않으면 컴파일 에러가 발생.
 *  - RuntimeException의 하위 클래스가 아닌 Exception 하위 클래스들.
 *  - (예) Exception, IOException, FileNotFoundException, ...
 */

public class ExceptionMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		

		

		



		Calculator calc = new Calculator();
		try {
			int result = calc.divide(700, 100);
			System.out.println("몫 = " + result);
		} catch (Exception e) {

			e.printStackTrace(); // 예외 종류, 메시지, 발생 위치를 프린트.
		}

	}

}
