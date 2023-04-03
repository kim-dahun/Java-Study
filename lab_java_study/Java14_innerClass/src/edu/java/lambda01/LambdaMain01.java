package edu.java.lambda01;

import edu.java.lambda01.Calculator.Calculable;

public class LambdaMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구현 클래스를 외부에 별도로 생성한 경우

		// Calculator 타입의 객체 생성
		Calculator calc = new Calculator(3.141592, 5.15618);

		// Calculable 인터페이스 구현 클래스 타입의 객체 생성
		Calculable adder = new CalcAdder();

		// 생성된 객체를 calculate 메서드의 argument로 전달
		double sum1 = calc.calculate(adder);

		System.out.println(sum1);
		// 지역 (내부) 클래스
		class Subtractor implements Calculable {

			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x - y;
			}

		}

		Calculable Subtractor = new Subtractor();
		double sub1 = calc.calculate(Subtractor);
		double sub2 = Math.round(sub1*1000)/1000.0;
		
		System.out.println("result : " + sub2);
		
		// 구현 클래스를 익명 클래스로 구현한 경우
		
		Calculable multiple = new Calculable() {
			
			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x*y;
			}
		};
		
		System.out.println(calc.calculate(multiple));
		
		double result = calc.calculate(new Calculable() {
			
			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x/y;
			}
		});
		
		System.out.println(result + " 나누기 ");
		
		
		// 구현 클래스를 람다 표현식으로 구현한 경우

		double sum = calc.calculate((x, y) -> 
			x + y
		);
		System.out.println(sum);
		
		
		
		/*
		 * 람다 표현식 - 함수 표기법
		 * 클래스 정의와 객체 생성을 동시에 하는 익명 클래스를 간단히 작성하기 위한 문법.
		 * 함수형 인터페이스(Fuctional Interface)만 람다 표현식으로 작성 할 수 있음.
		 * 	- 함수형 인터페이스 : 추상 메서드를 오직 1개만 갖는 인터페이스.
		 * 람다 표현식 문법:
		 * 		(파라미터 선언, ...) -> {메서드 코드;};
		 * 람다 표현식의 파라미터 선언에서는 타입을 생략해도 된다.
		 * 람다 표현식의 body가 문장이 하나만 있는 경우에는 {} 를 생략할 수 있다.
		 * 람다 표현식의 body가 return 문장만 있는 경우에는 {} 와 return 키워드를 모두 생략하고 리턴값만 표기해도 됨.
		 * 		(파라미터 선언, ...) -> 리턴 값
		 * 
		 * 람다 표현식에서 파라미터가 1개인 경우에는 ()를 생략할 수 있음.
		 */
		
	}

}
