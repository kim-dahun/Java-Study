package edu.java.list02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class ListMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수를 저장하는 LinkedList 타입 객체 생성.
		// List 의 원소타입은 자바의 기본 타입을 사용할 수 없음!
		// 기본 타입 대신에 Wrapper 클래스를 사용해야 함.
		LinkedList<Long> pivot = new LinkedList<>();
		LinkedList<Integer> numbers = new LinkedList<>();
		LinkedList<Integer> odds = new LinkedList<>();
		LinkedList<Integer> evenSquares = new LinkedList<>();
		// LinkedList와 ArrayList는 원소 추가(add)/삭제(remove)/검색(get) 메서드 이름과 사용법이 동일.

		// 리스트 numbers 에 [0, 100) // [->이상 , )->미만 // 범위의 정수 난수 20개를 저장.
		// 리스트 numbers의 내용을 출력
		// 홀수들만 저장할 LinkedList 변수(odds) 선언, 객체 생성
		// numbers의 정수들 중 홀수들만 odds에 저장.
		// 리스트 odds의 내용 출력.
		// LinkedList 변수(evenSquares) 선언, 객체 생성
		// evenSquares에는 numbers의 숫자들 중 짝수들의 제곱을 저장.

		int numbersSize = 20;
		Random rand = new Random();
		Math.random();
		for (int i = 0; i < numbersSize; i++) {
			numbers.add(rand.nextInt(0, 100));
		}
		System.out.println(numbers + "\n");
		for (int i = 0; i < numbersSize; i++) {
			if (numbers.get(i) % 2 == 1) {
				odds.add(numbers.get(i));
			}
		}
		System.out.println(odds + "\n");
		for (int i = 0; i < numbersSize; i++) {
			if (numbers.get(i) % 2 == 0) {
				evenSquares.add(numbers.get(i) * numbers.get(i));
			}
		}
		System.out.println(evenSquares);
		System.out.println();

		// Iterator 사용.

		
		
		
		Iterator<Integer> itr = evenSquares.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\n\n\n\n\n");

		pivot.add(1L);
		pivot.add(1L);

		for (int i = 2; i < 100; i++) {
			pivot.add(pivot.get(i - 2) + pivot.get(i - 1));
		}
		int count = 0;
		for (int i = 0; i < 15; i++) {

			for (int j = 0; j < i && count < pivot.size(); j++) {
				System.out.print(pivot.get(count) + " ");
				count++;

			}
			System.out.println();
		}

		System.out.println(pivot);
	}

}
