package edu.java.loop09;

import java.util.Random;

public class LoopMain09_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== 과제 1 번 ====\n"); // 과제 1번
		
		for (int s1 = 1; s1 <=5 ; s1++) {
			for(int s2 = 1; s2 <= s1; s2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==== 과제 1 번 + 2번 응용 ====\n");
		// 피라미드 만들기 2n-1 개
		
		int floor = 10;
			
		for (int s1 = 1; s1 < floor; s1++) {
			
			int odd1 = s1*2-1; // 별 목표갯수
			
			for (int s2 = floor ; s2 > s1; s2--) {
				System.out.print(" ");
			}
			
			for (int s3 = 1 ; s3 <= odd1 ; s3++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println("==== 과제 2번 ===="); // 과제 2번
		
		for (int h1 = 1; h1 <= 5; h1++) {			
			
			for (int h2 = 1; h2 <= h1; h2++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int h3 = 4; h3 >= 1; h3--) {
			for (int h4 = 1; h4 <= h3 ; h4++) {
				System.out.print("*");
			}
			
		
		System.out.println();
		}
		
		System.out.println("==== 과제 3번 ====");
		
		Random r1 = new Random();
		
		int i = 0;
		while (true) {
			
			
			int ran1 = r1.nextInt(6)+1;
			int ran2 = r1.nextInt(1,7);
			
			System.out.printf("(%d , %d)\n",ran1,ran2);
			
			i=ran1+ran2;
			if (i==5) {
				System.out.println("주사위 합이 " + i + " 가 되어 반복을 종료합니다.");
				break;
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
