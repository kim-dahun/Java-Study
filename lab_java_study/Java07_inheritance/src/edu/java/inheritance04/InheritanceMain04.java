package edu.java.inheritance04;

public class InheritanceMain04 {

	public static void main(String[] args) {

		// 다형성과 타입 변환(casting) 연산자
		// SuperType var = new SubTybe();
		Parent ch1 = new Child();
		ch1.testParent();
		// -> 실제 생성된 객체는 Child 타입이지만, 변수 선언이 Parent 타입으로 되어 있어서
		// Parent 타입에서 정의된 메서드들만 보이고 사용할 수 있음.
		((Child) ch1).testChild();
		//-> Parent 타입으로 선언된 변수를 Child 타입으로 강제 변환(Casting) 을 하면
		// Child 타입에서 정의된 메서드들도 보이고 사용할 수 있음.
		
		
		Parent ch2 = new AnotherChild();
		// ((Child) ch2).testChild();
		// -> 문법 오류는 발생하지 않지만, child와 AnotherChild는 서로 casting 할 수 없는 타입이기 때문에
		// 실행 중에 에러가 발생
		// instanceof 연산자 : 변수명 instanceof 클래스이름.
		// 변수 클래스 타입의 인스턴스이면 true, 그렇지 않으면 false.
		if(ch2 instanceof Child ) {
			((Child)ch2).testChild();
		} else if ( ch2 instanceof AnotherChild) {
			((AnotherChild) ch2).testAnotherChild();
		} else {
			
		}
		((AnotherChild)ch2).testAnotherChild();

	}

}

class Parent {

	public void testParent() {
		System.out.println("I'm your Father!");
	}
}

class Child extends Parent {

	public void testChild() {
		System.out.println("child");
	}
}

class AnotherChild extends Parent {

	public void testAnotherChild() {
		System.out.println("Another Child");
	}
}