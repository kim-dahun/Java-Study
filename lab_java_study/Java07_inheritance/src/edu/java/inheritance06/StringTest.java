package edu.java.inheritance06;

public class StringTest {

	public static void main(String[] args) {

		// 상수(contant): final로 선언된 변수
		// 리터럴(literal): 만들어진 값.

		final int x = 1; // x->상수 , 1->정수 리터럴. 1이라는 값을 만들어서 x에 할당.

		String s1 = "hello"; //-> s1: 변수, "hello" : 문자열 리터럴
		String s2 = "hello"; // 이미 "hello" 라는 값이 생성되어 있기 때문에 s1을 참조하도록 설정.
		
		System.out.println(s1==s2);
		// s1 == s2 ( 참조하는 객체가 같기 때문에 true가 뜨는 것임. 실제로 문자가 같아서 true 가 뜨는 것은 아님 )
		// -> true : JVM은 같은 문자열 리터럴은 두 번 생성하지 않음.
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s3==s4);
		// -> False : 생성자는 호출할 때마다 새로운 객체를 힙(heap) 메모리에 생성.
		// 인스턴스를 새로 생성해서, 서로 다른 인스턴스를 참조하므로 참조하는 객체가 달라 false
		
		
	}

}
