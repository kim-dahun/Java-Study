package edu.java.array07;

import java.util.Random;

public class ArrayMain07 {

	public static void main(String[] args) {
		// 2차원 배열 : 1차원 배열들을 원소로 갖는 배열
		// n차원 배열의 원소를 참조할 때 인덱스가 n개 필요함.
		// for each 구문에서도 반복문 진행할 때 for each 구문이 n개 필요함.
		
		int [][] array = new int[4][]; // 사다리꼴 형태의 배열 만들기, 행의 길이만 설정하여 선언
		// 타입 []*n 차원 변수명 = 생성자 타입[행갯수][빈칸 or 열갯수];
		// array[0] = new int[3]; // array 각 행에 들어갈 배열 선언 ( 열의 길이 )
		// 배열[참조행] = 생성자 타입[열길이];
		
		
		/* int [][] array ={ {1,2,3,4},{5,6,7,8,9},{10,11,12} };
		// for ( int = i ; i<array.length ; i++ ) {
			for ( int = j ; j < array[i].length ; j++ {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		for ( int[] x : array ) {
			for ( int y : x {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		// 교육용 코드
		
		*/ 
		
		
		
		
		Random rand = new Random();
		
		// for 구문을 활용한 배열 원소 출력
		System.out.println("===========array==========");
		for (int i = 0 ; i < array.length ; i++) {
			int n = rand.nextInt(5)+1;
			array[i] = new int[n];
			System.out.print( "index : " + i + " = ");
			System.out.print("{ ");
			for (int j = 0 ; j < array[i].length ; j++) {
				array[i][j] = rand.nextInt(17);
				System.out.print(array[i][j]);
				System.out.print("(" + (j+1) + "열) ");
			}
			System.out.print("}\n");
			
		}
		System.out.println("===========array==========");
		
		System.out.println("---------------------------");
		
		// for-each 구문 활용 배열 원소 출력
		for (int[] x : array) { // array 2차원 배열의 배열원소를 x 라는 1차원 배열에 불러오기
			
			System.out.print("{ "); // x 라는 1차원 배열의 배열원소를 y 에 불러오기
			for (int y : x) {
				System.out.print(y + " "); // y 값을 순서대로 출력하기
			}
			System.out.print("}"); // 1차원 배열별로 구분해서 표기하기 위한 구분기호
			System.out.println();
		}
		
		System.out.println("---------------------------");
		// 2차원 배열의 인덱스
		
		System.out.println(array); // 2차원 배열
		System.out.println(array[0]); // 2차원 배열의 인덱스 i번째, 원소는 1차원 배열
		System.out.println(array[0][0]); // 2차원 배열의 인덱스 i번째의 j열 번째(i,j) 원소는 값 1개
		System.out.println(array[1][1]); // 2행 2열의 숫자
		
		//2차원 배열의 length
		
		System.out.println(array.length); // array 배열의 길이
		System.out.println(array[0].length); // array 배열의 첫 행을 참조했을때 그 행의 길이
	}

}
