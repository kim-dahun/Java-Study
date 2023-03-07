package edu.java.array03;

import java.util.Date;

public class ArrayMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EX 1.
		// 정수(int) 10개를 저장할 수 있는 배열 선언
		// 배열에 순서대로 0,2,4,6,8,10,12,14,16,18 값들을 저장
		// 배열의 원소들을 한 줄로 출력.
		
		int[] addnum = new int[10];
		
		for (int i = 0; i<=9 ; i++) {
			addnum[i] = i*2;
			System.out.print(addnum[i] + " ");
			
		}
		
		//<for each> 구문은 배열 내 원소 변경에 영향을 미칠 수 없고, 단지 확인하는 용도로 사용;
		//for ( int x : evens ) => int x는 evens 배열 원소의 값 자체를 바꾸는 게 아닌, 배열 원소의 값을 불러와서 표시하는 용도;
		// ** int x = evens를 단순히 참조하는 변수;
		
		System.out.println("\n\n=======================\n");
		// EX 2.
		// boolean 타입 10개를 저장할 수 있는 배열 선언
		// 배열에 순서대로 true, false, true, false, ... false 저장
		// 배열의 원소들을 한 줄로 출력.
		
		boolean[] tnf = new boolean[10]; // 선언 후 기본값은 false;
		
		
		for (int i = 0; i<tnf.length ; i++) {
			if(i%2==0) {
				tnf[i] = true;
				
			}
			else {
				tnf[i] = false; // 기본값이 false 라 없어도 정상 동작함
				
			}
			
			}
		for (boolean x : tnf) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		Date date = new Date();
		
		System.out.println(date);
		
	}

}
