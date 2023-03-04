package edu.java.variable01; // 첫 줄은 반드시 패키지 선언문이 와야함.

public class VariableMain01 { //클래스 선언

	public static void main(String[] args) { // 메인메서드 선언
		//변수(variable) : 프로그램에서 필요한 데이터를 저장하는 메모리 공간
		//(1) 변수 선언 => (2) 변수 초기화(값을 처음 저장하는 작업)
		
		int x; // 변수 선언 ( 타입 변수명 ; )
		x = 100; // 변수 초기화, 등호 오른쪽을 왼쪽에 대입한다
		System.out.println(x+50); // 변수 x의 값을 콘솔에 출력
		
		int y = 200;// 변수 선언과 초기화를 한 문장으로 작성
		System.out.println(y);
		
		x = 300; // 이미 선언된 변수 x의 값을 변경
		System.out.println(x);
		
		//int y = 50; 같은 이름 y로 변수를 선언했기 때문에 문법 오류
		
		// 변수 이름을 만드는 문법/관습:
		// 1. 변수 이름은 알파벳, 숫자, _(underscore) 사용
		// 2. 변수 이름은 숫자로 시작하면 안됌.
		// 3. 자바의 키워드(int, if, for, ... )는 변수 이름으로 사용 불가
		// 4. 같은 이름으로 변수 선언하는 것도 불가능
		// 5. 변수 이름은 영문 소문자로 시작하는 것을 권장 
		// 6. 변수 이름을 2개 이상의 단어로 만들때 camel 표기법을 사용하는 것을 권장
		//	(예) variableMain, studentAge...
	}

}
