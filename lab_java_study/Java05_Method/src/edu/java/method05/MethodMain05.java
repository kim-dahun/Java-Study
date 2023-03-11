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
		
		double result = calculate("+");
		System.out.println(result);	
		
		double[] arr = {1.0, 1.1}; // 가변길이 아규먼트일 때는 배열을 전달해도 됨.
        System.out.println(calculate("+", arr));
        
        System.out.println(calculate("*"));
		
	
	
	}
	// 문자열 "*" , "+" 를 받아서 모든 args 의 합계 혹은 곱셈을 반환
	// 문자열 "*","+" 이외 문자열은 모두 무시;
	// 문자열 "*" 상황에서 숫자 입력 없을 시 1 출력
	// 문자열 "+" 상황에서 숫자 입력 없을 시 0 출력
	
	public static double calculate(String op, double ...args) {
		double result = 0.0;
		
		switch (op) {
		case "+":
			for (double x : args) {
				result += x;
			}
			break;
		case "*":
			result = 1.0;
			for ( double x : args) {
				result *= x; // result = result * x;
			}
			break;
			
		default:
		}
		
		return result;
		
		
	}

}
