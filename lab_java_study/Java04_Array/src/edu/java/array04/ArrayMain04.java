package edu.java.array04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMain04 {

	public static void main(String[] args) {

		// 정수 5개를 저장할 수 있는 배열을 선언
		// 0 이상 9 이하의 정수 난수 5개를 배열에 저장.
		// 배열의 내용을 출력.
		// 배열의 모든 원소의 합을 계산하고 출력.
		// 배열 원소들의 평균을 double 타입으로 계산하고 출력.
		// 중복 체크값 추가 + 배열 정렬 ( Self-Study )

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] score = new int[5];
		int[] vsscore = new int[5]; // score와 대조해서 중복값을 걸러줄 대조군 배열
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			int sc = ran.nextInt(10);
			score[i] = sc; 
			vsscore[i] = sc; // 같은 인덱스에 원소를 저장
			for (int j = 0; j < i; j++) { // i 원소 저장 갯수만큼 j 반복
				if (score[i] == vsscore[j]) { // i로부터 받은 원소와 j에 지금까지 입력된 원소 대조
					score[i] = 11; // score 배열에 들어가면 안되는 수 중 하나 지정
					i--; // i 재실행을 위해 횟수 차감
				}
			}
			sum = sum + sc; // i 반복문 1회 실행 시마다 sum 함수에 배열원소값 가산
		}

		for (int x : score) {
			System.out.print(x + " "); // for-each 항목으로 score 배열 나열

		}

		System.out.println();
		System.out.println("정렬을 원하시면 <정렬> 이라고 입력해주세요.");
		String select = scan.next(); // 글자 String 을 받아들이기 위한 Scanner
		

		if (select.equals("정렬")) {
			Arrays.sort(score); // 배열 오름차순으로 정렬
			for (int x : score) { 
				System.out.print(x + " ");

			}
		} else {
			System.out.println("정렬하지 않습니다.");
		}

		System.out.println();
		System.out.println("배열 원소의 합계 : " + sum); // 합계 표시
		double avg = (double) sum / score.length; // 합계를 (double) 변수로 캐스팅한 후 그 값을 인덱스 길이로 나눔.
		System.out.println("배열 원소들의 평균은 " + avg); // 평균값 표시
	}

}
