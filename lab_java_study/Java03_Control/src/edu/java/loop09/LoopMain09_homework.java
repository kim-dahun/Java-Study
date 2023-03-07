package edu.java.loop09;

import java.util.Random;

public class LoopMain09_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== 과제 1 번 ====\n"); // 과제 1번

		for (int s1 = 1; s1 <= 5; s1++) {
			for (int s2 = 1; s2 <= s1; s2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// while 반복문을 활용한 처리
		int line = 1;
		while ( line <= 5) {
			int count = 1;
			while (count <= line) {
				System.out.print("*");
				count ++;
			}
			System.out.println();
			line++;
		}

		System.out.println("==== 과제 1 번 + 2번 응용 ====\n");
		// 피라미드 만들기 2n-1 개

		int floor = 10;

		for (int s1 = 1; s1 < floor; s1++) {

			int odd1 = s1 * 2 - 1; // 별 목표갯수

			for (int s2 = floor; s2 > s1; s2--) {
				System.out.print(" ");
			}

			for (int s3 = 1; s3 <= odd1; s3++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==== 과제 2번 ver2 ====");
		
		// 하나의 for문에 2개 for문 하위로 걸어서 삼각형 구조
		
		for (int i = 1; i <= 9 ; i++) {
			if(i>=5) {
				for (int j = 9 ; j >= i ; j--) {
					System.out.print("*");
				}
				
			} else {
				for (int j = 1 ; j <= i ; j++ ) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println("==== 과제 2번 ===="); // 과제 2번

		// for문 2개를 설정하고, 하위 for문 각각 1개씩 해서 2줄로 연결
//		for (int h1 = 1; h1 <= 5; h1++) {
//
//			for (int h2 = 1; h2 <= h1; h2++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
//
//		for (int h3 = 4; h3 >= 1; h3--) {
//			for (int h4 = 1; h4 <= h3; h4++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}

		// Ctrl+Shift+F : 코드 포맷팅(자동 정렬 기능)

		System.out.println("==== 과제 3번 ====");

		Random r1 = new Random();

		int i = 0;
		while (true) {

			int ran1 = r1.nextInt(6) + 1;
			int ran2 = r1.nextInt(1, 7);

			System.out.printf("(%d , %d)\n", ran1, ran2);

			i = ran1 + ran2;
			if (i == 5) {
				System.out.println("주사위 합이 " + i + " 가 되어 반복을 종료합니다.");
				break;
			}
			
			
			}
	for (;;) {
		int rand1 = r1.nextInt(6)+1; // (a)+1 => 0+1 <= rand2 < a+1
		int rand2 = r1.nextInt(1,7); // (a,b) => a<= rand2 < b
		i = rand1 + rand2;
		System.out.printf("(%d,%d)\n",rand1,rand2);
		if(i==5) {
			System.out.println("합이 5가 되었습니다");
			break;
		}
		}

	}

}
