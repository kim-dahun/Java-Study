package edu.java.array04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMain04 {

	public static void main(String[] args) {

		// 정수 6개를 저장할 수 있는 배열을 선언
		// 1 이상 45 이하의 정수 난수 6개를 배열에 저장.
		// 배열의 내용을 출력.
		// 로또 장수 입력 받아서 입력 받은 수만큼 로또 출력.
		// 중복 체크값 추가 + 배열 정렬 ( Self-Study )

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] score = new int[5];
		int[] vsscore = new int[5]; // score와 대조해서 중복값을 걸러줄 대조군 배열
		int sum = 0;

		for (int i = 0; i < score.length; i++) {

			score[i] = ran.nextInt(10);
			vsscore[i] = score[i]; // 같은 인덱스에 원소를 저장
			for (int j = 0; j < i; j++) { // i 원소 저장 갯수만큼 j 반복
				if (score[i] == vsscore[j]) { // i로부터 받은 원소와 j에 지금까지 입력된 원소 대조

					for (int x : score) {
						System.out.print(x + " ");
					}
					System.out.println();
					System.out.println((i + 1) + " 번째 수인 " + score[i] + " 는 중복값입니다.");
					System.out.println();
					// score[i] = 11; // score 배열에 들어가면 안되는 수 중 하나 지정

					i--;
					// i 재실행을 위해 횟수 차감
				}
			}
			 // i 반복문 1회 실행 시마다 sum 함수에 배열원소값 가산
			//System.out.println("현재까지 합계는 : " + sum);
			//sum = sum + score[i]; 
			// 여기서 해당 구문을 사용하려면, 중복 체크 반복문을 나올때 score[i] 값을 0으로 초기화해야함.
			// 아니면, 최초 반복문 이후로 빼서 최종적으로 선정된 배열원소 나열과 함께 합계를 계산해야함.
		}

		
		for (int x : score) {
			System.out.print(x + " "); // for-each 항목으로 score 배열 나열
			sum = sum + x;
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
