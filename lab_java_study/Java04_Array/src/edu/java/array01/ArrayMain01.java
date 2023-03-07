package edu.java.array01;

public class ArrayMain01 {

	public static void main(String[] args) {
		// <자바에서의> 배열(array) : 같은 타입의 데이터 여러 개를 하나의 변수 이름으로 저장하기 위한 메모리 공간.
		// 인덱스(index) : 배열에서 데이터가 저장된 위치를 나타내는 정수.
		// 배열의 인덱스는 0부터 시작
		// 배열의 마지막 인덱스 = 배열원소 개수 - 1;
		// 모든 배열은 배열의 길이(배열의 원소 개수) 를 알려주는 length 속성을 가지고 있음. 

		// 정수(int) 4개를 저장할 수 있는 배열 선언 및 초기화 ( 최초에 0 으로 초기화 )
		int[] scores = new int[4]; // scores 는 int[4] 를 저장할 수 있는 메모리공간을 참조
		// 배열은 생성 시 생성자 사용해서 선언
		// 배열은 사용 전 반드시 초기화가 되어 있어야 함(length가 몇인지)
		
		// 배열에 특정 인덱스에 원소를 저장(재할당)
		scores[0] = 100; // 0번 인덱스에 100이라는 값을 저장
		scores[1] = 90; // 1번 인덱스에 90 이라는 값을 저장
		System.out.println(scores[0] + scores[1]); // 배열 scores의 0번값 + 1번값
		
		// 배열에 특정 인덱스에 저장된 원소의 값 읽기
		System.out.println(scores); // scores의 참조위치와 무슨 항목인지 출력 ** @ 뒷쪽 : 참조 위치
		System.out.println(scores[0]); // 배열 scores의 0번값을 출력
		System.out.println(scores[0] + "," + scores[1]);
		
		System.out.println("length = " + scores.length);
		for (int index=0; index<scores.length ; index++) { // 배열 마지막 값 까지 반복하도록 설정 변수명.length;
			System.out.print(scores[index] + " ");
		}
		
		System.out.println("\n---------------------------");
		
		// 배열 선언 초기화 방법 2:
		int[] numbers = {100, 90,0 ,50, 80}; // 배열의 인덱스에 선언 시 항목을 넣고 초기화;
		for(int i = 0 ; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		numbers[2] = 99;
		for(int i = 0 ; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n-------------------------------");
		
		// 향상된 for 문 ( enhanced for statement ). for-each 구문
		for (int x : numbers) { // 순서대로 이동하며, 원소 발견하지 못하는 시점까지 반복
			System.out.println(x); // for ( 변수선언(배열의 원소타입으로 선언) : 배열)
		}
		
		}

}
