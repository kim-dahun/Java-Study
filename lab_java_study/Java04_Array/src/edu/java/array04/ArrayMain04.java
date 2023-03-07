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
		// 중복 체크값 추가(Self-study)

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] score = new int[5];
		int[] vsscore = new int[5]; // score와 대조해서 중복값을 걸러줄 대조군 배열
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			int sc = ran.nextInt(10);
			score[i] = sc;
			vsscore[i] = sc;
			for (int j = 0; j < i; j++) {
				if (score[i] == vsscore[j]) {
					score[i] = 11;
					i--;
				}
			}
			sum = sum + sc;
		}

		for (int x : score) {
			System.out.print(x + " ");

		}

		System.out.println();
		System.out.println("정렬을 원하시면 <정렬> 이라고 입력해주세요.\n");
		String select = scan.next();
		

		if (select.equals("정렬")) {
			Arrays.sort(score);
			for (int x : score) {
				System.out.print(x + " ");

			}
		} else {
			System.out.println("정렬하지 않습니다.");
		}

		System.out.println();
		System.out.println("배열 원소의 합계 : " + sum);
		double avg = (double) sum / score.length;
		System.out.println("배열 원소들의 평균은 " + avg);
	}

}
