package edu.java.method02;

import java.util.Random;

public class MethodMain02 {

	public static void main(String[] args) {
		// argument를 가지고, 리턴 값이 있는 메서드를 작성/호출 연습
		
		System.out.println(add(3.14152,6.185)); // 메서드 호출. argument = a, b 의 실제값.
		
		// 같은 클래스 안에서 작성한 메서드인 경우에는 메서드 이름으로만 호출하면 됌.
		Random rand = new Random();
		
		double n1 = rand.nextDouble(11);
		double n2 = rand.nextDouble(12);
		int n3 = rand.nextInt(10);
		
		System.out.println("계산식 1번 값 : " + n1);
		System.out.println("계산식 2번 값 : " + n2);
		System.out.println("================================");
		
		System.out.println("subtract : " + subtract(n1,n2));
		System.out.println("multiply : " + multiply(n1,n2));
		System.out.println("divide : " + divide(n1,n2));
		
		double round1 = divide(n1,n2)*1000;
		int round11 = (int) round1;
		double round111 = (double) round11 / 1000;
		System.out.println("rounddown((divide),3) : " + round111);
		
		System.out.println("isEven : " + isEven(n3) + "(" + n3 + ")");
		int n = rand.nextInt(1,10);
		makeArray(n);
		System.out.print("makeArray 배열은 { ");
		for ( int i = 0 ; i < makeArray(n).length ; i++) {
			System.out.print(makeArray(n)[i] + " ");
		}
		System.out.print("}\n");
		
	}
	
	
/**
 * 실수 2개를 전달받아서 덧셈 결과를 리턴하는 메서드.
 * @param a 실수(double) 타입.
 * @param b 실수(double) 타입.
 * @return a+b를 한 sum을 리턴.
 */
	public static double add(double a, double b) {
		// 메서드 정의(선언)
		// 메서드 수식 - public static
		// 메서드 리턴 타입 - double
		// 메서드 이름 - add
		// 파라미터(parameter) - double a, double b => 반드시 어떤 인수가 들어간다 가정하고 코드를 짜면 됌.
		
		
		double sum = a+b;
		return sum; // 리턴 문장. sum -> 리턴 값.
	} 
	
	 /**
     * subtract
     * 숫자 2개를 전달받아서, 뺄셈의 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x - y.
     */
    // TODO
    public static double subtract(double x, double y) {
    	
    	return x-y;
    }
    /**
     * multiply
     * 숫자 2개 전달받아서 곱셈 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x * y.
     */
    // TODO
    public static double multiply(double x, double y) {
    	return x*y;
    }
    /**
     * divide
     * 숫자 2개를 전달받아서, 나눗셈 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x / y.
     */
    // TODO
    public static double divide ( double x, double y) {
    	return x/y;
    }
    
    /**
     * isEven
     * 정수가 짝수인 지 아닌 지를 리턴하는 메서드.
     * @param n 짝수인 지 홀수인 지 검사할 정수.
     * @return n이 짝수이면 true, 그렇지 않으면 false.
     */
    // TODO
    public static boolean isEven(int n) {
    	// return n%2==0; boolean 리턴 시 조건 자체를 적으면 결과에 따라 true, false를 리턴해주게 된다.
    	
    	boolean x = (n%2==0) ? true : false;
    	return x;
    }
    /**
     * makeArray
     * argument로 전달된 배열의 길이 크기의 정수 배열을 생성하고,
     * 임의의 난수들로 배열을 초기화해서 리턴하는 함수.
     * @param length 배열의 길이. 양의 정수.
     * @return length개의 난수들로 초기화된 정수 배열.
     */
    public static int[] makeArray(int length) {
    	int[] array = new int[length];
    	Random rand = new Random();
    	for (int i = 0 ; i < array.length ; i++) {
    		array[i] = rand.nextInt(100);
    	}
    	
    	return array; // return 하게 되면 메서드는 해당 메서드는 종료됌. ( 값의 반환 + 메서드 종료, 2가지 역할 )
    }
}
