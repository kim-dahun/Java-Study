package edu.java.method01;

import java.util.Random;

// 메서드 정의(선언) 방법:
// [수식어] 리턴타입 메서드 이름([파라미터 선언, ...]){ ... }
// 메서드의 리턴 값이 없는 경우에는 리턴 타입을 void 라고 선언함.
// 

/**
 * 클래스와 메서드의 문서화 주석을 만들 수 있음.
 * @author DAHUN
 *
 */


public class MethodMain01 {

	// main 메서드(method) : 프로그램 시작점.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		// -> println() 메서드 호출(기능 실행). -> 호출 결과(동작) : 콘솔 창에 문자열을 출력.
		// -> method : 기능, 즉 기능들이 미리 작성되어 있는 코드
		// -> 메서드(method) : 클래스 안에서 정의하는 기능(함수, function);
		// -> 함수 ( function) : 프로그램에서 사용될 기능을 코드 블록으로 작성한 것.
		// -> 메서드 : 클래스 내부에서 작성된 함수.
		// -> 자바 언어는 메서드만 제공하고, 함수는 제공하지 않음.
		// -> 자바 언어는 메서드 안에서 메서드를 정의하는 것을 제공하지 않음.

		// -> 메서드 호출(call, invoke): 메서드를 사용하기 위해 메서드를 사용하는 것.
		// -> argument : 메서드를 호출할 때 메서드에게 전달하는 값
		// -> parameter : 매개변수.argument를 저장하기 위한 메서드의 지역 변수

		// -> 반환 값(return value) : 메서드가 모든 기능을 수행한 후 메서드를 호출한 곳으로 되돌려 주는 값;
		// - 메서드는 반환값이 있을 수도 있고, 없을 수도 있음.
		// - println(): 반환 값이 없는 메서드
		// - nextInt() : 반환 값이 있는 메서드

		Random random = new Random();

		int x = random.nextInt(2); // -> 2는 args.
		// -> nextInt() 메서드(기능) 호출 -> nextInt() 메서드는 난수를 반환(Return).
		System.out.println(x);

		System.out.println("테스트1");
		newLine(); // 같은 클래스에 선언(정의)된 메서드를 호출.
		System.out.println("테스트2");
		add(2, 7);
		newLine(2);
		System.out.println("테스트3");
		newLine(3);
		System.out.println("테스트4");
	}

	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);

	}

	/**
	 * 콘솔에 빈 줄 하나를 출력하는 메서드.
	 */
	public static void newLine() {

		System.out.println();

	}
	/**
	 * 콘솔에 n개의 빈 줄을 출력하는 메서드
	 * 
	 * @param n 은 0 이상의 정수. 출력할 빈 줄의 갯수
	 */
	public static void newLine(int n) {
		for (int i = 0; i < n ; i++) {
			System.out.println();
		}
	}

}
