package sample.work1;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array23 = new int[2][3]; // heap 공간에 array 생성
		int j = 0;
		int i = 0;
		for(i = 1; i<=2 ; i++) {
			System.out.print((i) + "행 " + "[ ");
			for(j = 1; j<=3 ; j++) {
				
				
				array23[i-1][j-1] = i*j;
				System.out.print(array23[i-1][j-1] + " ");
			}
			System.out.print("] ");
			System.out.println();
			
		}
		System.out.println("해당 배열은 " + (i-1) + "행 " + (j-1) + "열");
	}

}
