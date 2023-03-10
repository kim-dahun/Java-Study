package edu.java.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("이름: %s \n" , "오쌤");
		System.out.printf("이름: %s, 나이: %d \n", "오쌤",16);
		System.out.printf("이름: %s, 나이: %d, 키: %fcm \n","오쌤",16,179.9);
	
		// Method 작성 시 매개변수 Object ... [변수명] 라 작성하면 매개변수 개수를 여러개 받을 수 있음.
		// Object ... [변수명] (가변길이 argument);
		
		// 가변길이(variable-length) argument를 갖는 메서드(Method)
		// 파라미터를 선언할 때, 변수타입 뒤에 "..." 을 붙임.
		// 가변 길이 argument 는 메서드 안에서는 배열 처럼 취급하면 됌.
		// (주의) 가변 길이 argument 는 가장 마지막 parameter 가 되야 한다.
		// -> (String X, object ... Y)
		// 가변길이 argument를 갖는 parameter는 오직 1개만 선언할 수 있다.
	}

}
