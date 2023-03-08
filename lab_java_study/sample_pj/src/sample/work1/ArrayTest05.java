package sample.work1;

import java.util.Random;

public class ArrayTest05 {

	public static void main(String[] args) {
		// 3차원 배열 만들어보기
		
		int[][][] thirdArray = new int [3][][];
		
		Random rand = new Random(); // 매번 새로운 배열을 만들기 위한 난수
		System.out.print("{");
		for (int i = 0; i<thirdArray.length ; i++) {
			int j = rand.nextInt(1,6);
			thirdArray[i] = new int[j][];
			System.out.print("{");
			for (j = 0; j<thirdArray[i].length ; j++) {
				int k = rand.nextInt(1,5);
				thirdArray[i][j] = new int[k];
				System.out.print("{");
				for (k = 0; k<thirdArray[i][j].length ; k++) {
					thirdArray[i][j][k] = j*4+k+1;
					System.out.print(thirdArray[i][j][k] + " ");
				}
				System.out.print("}");
				System.out.println();
			}
			System.out.print("}");
			System.out.println();
		}
		System.out.print("}");
		
		
	}

}
