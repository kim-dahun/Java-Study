package edu.java.modifier06;

// final 수식어 : 최종적인. 변경할 수 없는.
// final 지역 변수 : 변경할 수 없는 지역 변수. 상수(Constant). 초기화 이후에는 값을 변경할 수 없는 변수.
// final 클래스 멤버(field, constructor, method) : 변경할 수 없는 클래스 멤버.
// final field 는 반드시 초기화하는 문장을 명시해야 한다.
//  (1) 필드 선언과 동시에 값을 초기화.
//  (2) argument를 갖는 생성자를 사용해서 값을 초기화.
// final 클래스 : 변경할 수 없는 클래스. 상속할 수 없는 클래스.


public class ModifierMain06 {

	private static final int VERSION = 1; // 선언과 동시에 초기화
	
	private final int test; // -> final 필드를 선언할 때 초기화하지 않은 경우에는
	// 생성자를 이용해서 final 필드를 초기화해야함.
	
	public ModifierMain06(int test) { // test를 생성자로 받은 인수를 활용해 초기화
		this.test = test;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a = 1;
//		a = 2 ; // -> final로 선언된 지역변수는 재할당( 값 변경 ) 할 수 없다.
	
		// VERSION = 2 ; //-> final 필드는 값을 재할당(변경)할 수 없다.
		
	}

}
