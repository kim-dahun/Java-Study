package sample.work1;

import java.util.Random;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 복사해보기
		int old = 3;
		int add = 3;
		int[] oldnum = new int[old];
		int[] newnum = new int[old];
		Random rand = new Random();
		int loopSt = rand.nextInt(5);
		int limit = 3*loopSt+1;

		for (int i = 0; i < oldnum.length;i++ ) {
			
			oldnum[i] = rand.nextInt(45)+1;
			 if (i == oldnum.length-1) {
				
				newnum = new int[old+add];
				for (int j = 0; j < oldnum.length; j++) {
					
					newnum[j] = oldnum[j];
				}
				
				if ( i > limit) {
					
				} else {
					old += add;
					oldnum = new int[old];
					for (int k = 0; k < oldnum.length; k++) {
						oldnum[k] = newnum[k];
					}
				}
				
				
			}
			
			System.out.print("{ ");
			for (int x : oldnum) {
				System.out.print(x + " ");
			}
			System.out.print("} ");
			System.out.println();
			
		}
		
	}
}
