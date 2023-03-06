package edu.java.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// for문을 사용한 구구단
		for (int x=2; x<=9 ; x++) {
			System.out.println(x +" 단 시작 \n");
			for (int y=1; y<=9 ; y++) {
				//System.out.println(x + " X " + y + " = " + x*y);
				System.out.printf("%d x %d = %d\n", x, y, x*y);
			}
			//System.out.println();
		}
		
		System.out.println("\n============\n"); // while 문 사용한 구구단

		int x=2;
		int y=1;
		while(x<=9) {
			 // 변수를 while문 블록 내 선언해야 인식하고 반복
			System.out.println(x + " 단");
			while(y<=9) {
				
				System.out.printf("%d X %d = %d\n", x , y , x*y);
				y++;
			}
			y = 1;
			System.out.println();
			x++;
			
		}
		
		System.out.println("\n============\n");
		//do while 문 활용 이중반복문.
		int a = 2;
		int b = 1;
		
		do {
			System.out.printf("%d 단 ===>\n",a);
			do { // for로 치면 1번 루프 안에 2번 루프를 넣는 방식
				System.out.println(a + " X " + b + " = " + a*b);
				b++;
			}
			while(b<=9);
			a++;
			b=1;
			System.out.println();
		}
		while(a<=9);
		
		
	}

}
