package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 출력 시 2단은 2x2까지, 3단은 3x3까지,
		
		System.out.println("=========for(Non-break)=========");
		
		for ( int x = 2; x<=9 ; x++) {
			System.out.printf("%d 단" + "(자기 수 까지만) \n",x);
			for (int y = 1; y<=x ; y++) {
				System.out.printf("%d X %d = %d \n", x , y , x*y);
			}
			System.out.println();
		} // for 문 end
		
		System.out.println("=========for(using-break)=========");
		
		for ( int x = 2; x<=9 ; x++) {
			System.out.println(x + " 단\n");
			for (int y = 1 ; y <= 9 ; y++) {
				System.out.printf("%d X %d = %d\n", x, y , x*y );
				if ( y == x) {
					System.out.println();
					break;
				} // if 종료 부분
			} // for (y) 종료 부분
		} // for (x) 종료 부분
		
		System.out.println("=========while=========");
		
		int x = 2;
		int y = 1;
		while (x<=9) {
			System.out.println(x + " 단 시작 ===>");
			while (y<=x) {
				System.out.printf("%d X %d = %d\n", x, y , x*y);
				y++;
			}
			y=1;
			x++;
			System.out.println();
		}
		
		System.out.println("=========Do-while=========");
		
		int a = 2;
		int b = 1;
		
		do {
			System.out.println(a + "단");
			do {
				System.out.printf("%d X %d = %d\n", a, b, a*b);
				b++;
			} while(b<=a);
			b=1;
			a++;
		} while(a<=9);
		
	}

}
