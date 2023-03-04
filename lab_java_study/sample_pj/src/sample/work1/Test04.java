package sample.work1;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x1 = 1; x1 <6; x1++) { // 만들려는 층수 +1 까지 조건 걸고 반복 시작
			for (int x3 = 6; x3 > x1; x3--) { 
				// 피라미드 만들려면 여백 공간 삽입 필요함. 
				// 필요 공간은 별수가 늘어날 수록 줄어듦(별 수 증가랑 역순으로 짜기)
				System.out.print(" ");
			}
			
			for (int x2 = 0; x2 < x1*2-1; x2++) { 
				// 별 수는 1개씩 증가할 경우 반복조건 * 2, 홀수 증가를 원하면 반복조건 *2-1 로 설정
				// \n print 추가해서 별끼리 떨어뜨려놓도록 설정
				System.out.print("*");}
			
			System.out.println();
		}
	}

}
