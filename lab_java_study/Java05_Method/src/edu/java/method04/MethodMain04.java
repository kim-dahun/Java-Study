package edu.java.method04;

public class MethodMain04 {

	public static void main(String[] args) {
		// 메서드 오버로딩(Method Overloading):
		// 같은 이름의 메서드를 여러 개 정의하는 것.
		// 메서드의 파라미터의 타입 또는 개수가 다를 때 overloading 할 수 있음.
		// (주의) 메서드의 파라미터는 같고, 리턴 타입만 다른 경우 overloading 불가.
		
		
		
		
		System.out.println("안녕");
		System.out.println(3);
		System.out.println(3.14);
		System.out.println('e');
		System.out.println(3+"일");
		System.out.println(true);
		
	
		
		System.out.println(divide(10.0,4)); // 결국 호출할 때 어떤 메서드가 작동할지 결정되므로, 메서드 오버로딩 시에는 호출에 영향을 주는 parameter가 가장 중요
		System.out.println(divide(10, 4));
	}
	//public static double divide(int x, int y) {
	//	return (double) x/y;
	//}
// -> Return type 이 다르다고 해서 overloading 할 수 있는 것은 아니다.
	public static int divide(int x, int y) {
		
		return x/y; // x를 y로 나눈 몫 리턴
		
	}
	
	public static double divide(double x, double y) {
		
		return x/y; // (소수점을 포함) 나누기 결과 리턴
		
	}
}
