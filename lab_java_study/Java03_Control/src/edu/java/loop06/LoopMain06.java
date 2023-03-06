package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// do-while 반복문
		int n = 1;
		do {
			System.out.print(n + " ");
			n++;
		}
		while(n<=10);
		
		System.out.println();
		
		n = 1;
		
		while(n < 5) {
			System.out.print(n+" ");
			n++;
		}
		System.out.println();
		
		n = 1;
		do {
			System.out.print(n + " ");
			n++;
		}
		while(n>5);
	} // do while 문은 반복 여부 검사 전에 무조건 블록을 한 번 실행한다. ( for, while문과의 차이점 )
	// for 문과 while 문은 블록 실행 전에 반복 여부를 먼저 검사하고, 조건이 참이면 블록 실행.

}
