package edu.java.lambda02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(1, 100));

		}

		numbers.forEach(x -> System.out.print(x + " "));

		System.out.println();

		// 리스트 numbers 에서 짞수들만 선택해서 새로운 리스트에 저장하고 출력.
		System.out.println();

		ArrayList<Integer> arr = new ArrayList<>();

		numbers.forEach(x -> {
			if (x % 2 == 0) {
				arr.add(x);
			}
		});
		System.out.println(arr);

		System.out.println();

		System.out.print("[ ");
		for (Integer i : numbers) {
			System.out.print(i + " ");
		}
		System.out.print("]");
		System.out.println();

		// stream 통로 , filter 조건에 만족한 값만 통과시킨다 , toList 통과한 데이터로 리스트를 만든다.

		List<Integer> evens2 = numbers.stream() // 리스트의 원소들이 흘러가는 통로
				.filter(x -> x % 2 == 0) // 조건을 만족하는 원소들만 필터링.
				.toList(); // 필터링된 결과를 리스트로 만듦.
		System.out.println(evens2);
		// filter 메서드의 argument:
		// 파라미터가 1개이고, 리턴 타입이 boolean인 Fuctional Interface 객체를 전달.

		// 리스트 numbers에서 홀수들의 제곱을 저장하는 리스트를 만들고, 출력
		List<Integer> odds2 = new ArrayList<>();
		for (Integer x : numbers) {
			if (x % 2 == 1) {
				odds2.add(x * x);
			}
		}
		System.out.println(odds2);

		List<Integer> odd = numbers.stream() // 리스트의 원소들이 순서대로 지나가는 통로
				.filter(x -> x % 2 == 1) // 조건에 만족되는 원소 필터링
				.map(x -> x * x) // 필터링된 원소를 다른 값으로 매핑(변환)
				.toList(); // 필터 및 매핑된 결과를 리스트로 만듦.

		System.out.println(odd);

		// map 메서드의 argument:
		// 파라미터가 1개이고, 리턴 값이 있는(void가 아닌) FuntionalInterface객체.

		List<String> languages = Arrays.asList("Java", "SQL", "JavaScript", "Python");

		// List languages 에서 5글자 이상인 문자열을 소문자로 변환 문자열을 원소로 갖는 List를 만들고 출력.

		List<String> result = languages.stream().filter(x -> x.length() >= 5).map(x -> x.toLowerCase()).toList();

		System.out.println(result);

		List<String> result2 = new ArrayList<>();

		for (String x : languages) {

			if (x.length() >= 5) {
				String y = x.toLowerCase();
				result2.add(y);
			}
			

		}

		System.out.println(result2);
	}

}
