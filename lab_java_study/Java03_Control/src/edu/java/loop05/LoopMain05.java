package edu.java.loop05;

public class LoopMain05 {

	public static void main(String[] args) {
		// 1-10 정수를 오름차순 정렬
		for (int i=1 ; i<=10 ; i++) {
			System.out.print(i + "\t");
		}
		 //while 반복문
		int n = 1;
		while(n<=10) {
			
			System.out.print(n + " ");
			n++;
		}
		
		// 출력 결과 : 1 3 5 7 9
		System.out.println();
		
		
		int n1 = 1;
		
		while(n1<=5) {
			System.out.print((n1*2)-1 + " ");
			n1++;
		}
		System.out.println();
		
		for (int n2 = 1; n2 <=5 ; n2++) {
			int n3 = n2 *2 -1;
			System.out.print(n3 + " ");
		}
		
		System.out.println();
		n1 = 1;
		
		while (n1 < 10) {
			if (n1 % 2 == 1) {
				System.out.print(n1 + " ");
			}
			n1++;
		}
		
	}


}
