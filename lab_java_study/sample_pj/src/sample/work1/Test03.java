package sample.work1;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 별쌓기 정순에서 역순으로
		for (int i = 1; i <= 9 ; i++) {
			if(i>=5) {
				for (int j = 9 ; j >= i ; j--) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1 ; j <= i ; j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
