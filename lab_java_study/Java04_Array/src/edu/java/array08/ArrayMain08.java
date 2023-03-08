package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

	public static void main(String[] args) {
		// 1차원 배열 선언 초기화 (1) : type[] arrayName = {...};
		// 1차원 배열 선언 초기화 (2) : type[] arrayName = new type[element EA];
		
		// 2차원 배열 선언 초기화 (1) : type[][] arrayName = {{...},{...},...};
		// 2차원 배열 선언 초기화 (2) : type[][] arrayName = new type[2차원 배열의 element EA][2차원 배열 내부의 1차원 배열의 element EA];
		// new type[2차원 배열의 원소 개수][해당 2차원 배열의 1차원 배열 원소의 개수];
		
		// 2차원 배열 선언 초기화 (3) : type[][] arrayName = new type[n][];
		//								arrayName[n2] = new type[n3]; -> arrayName[n2] 번째 index의 배열 길이를 n3으로 설정
		// 2차원 배열을 선언하고 생성할 때 행의 개수(2차원 배열의 원소 개수) 는 반드시 필요함.
		// 2차원 배열의 열의 개수(각각의 1차원 배열의 원소 개수) 는 나중에 설정할 수 있음.
		
		int[][] array1 = new int[3][4];
		for ( int i = 0 ; i < array1.length ; i++) {
			for (int j = 0 ; j < array1[i].length ; j++) {
				array1[i][j] = i*4 + j + 1;
			}
		}
		
		for ( int[] member : array1) {
			for (int x : member) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		
		
		
			
		
		
	}

}
