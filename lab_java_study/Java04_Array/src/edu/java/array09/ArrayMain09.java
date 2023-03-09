package edu.java.array09;

import java.util.Random;

public class ArrayMain09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1차원 정수(int) 배열 3개를 갖는 2차원 배열을 선언.
		// 첫번째 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수 4개 저장.
		// 저장하는 난수의 범위는 0이상, 100이하
		// 2차원 배열의 원소들을 출력
		// 2차원 배열의 모든 원소들의 합을 계산하고 출력
		// 2차원 배열의 모든 원소들의 평균을 계산하고 출력
		// 최댓값을 찾은 후 출력
		// 최소값을 찾은 후 출력
		
		int elsum = 0;
		double elavg = 0;
		int elmax = 0;
		int elmin = 101;
		
		
		Random ran = new Random();
		int[][] array = new int[3][];
		int row = 0;
		for (row = 0 ; row < array.length ; row++) {
			
			array[row] = new int[row+2];
			for (int j = 0 ; j < array[row].length ; j++) {
				array[row][j] = ran.nextInt(0,101);
				if (array[row][j] < elmin) {
					elmin = array[row][j]; // elmin = ( array[row][j] < elmin ) ? array[row][j] : elmin;
				}
				if (array[row][j] > elmax) { // elmax = ( array[row][j] > elmax ) ? array[row][j] : elmax;
					elmax = array[row][j];
				}
				elsum += array[row][j];
			}
			
		}
				
		
		int count = 0;
		for ( int[] num2 : array) {
			System.out.print("{ ");
			int elsum2 = 0;
			for ( int num1 : num2) {
				System.out.print(num1 + " ");
				count++;
				elsum2 += num1;
				
				
			}
			System.out.print("}");
			System.out.print(" 해당 배열의 평균은 " + (elsum2/count) + " 합계는 ");
			System.out.println(elsum2);
			
			
			System.out.println();
			
		}
		elavg= (double)elsum/count;
		
		
		System.out.println("합계 : " + elsum);
		System.out.println("최대값 : " + elmax);
		System.out.println("최소값 : " + elmin);
		System.out.println("평균값 : " + elavg);
		
	}

}
