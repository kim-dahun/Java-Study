package homework.itwill.java;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=100; i++) { // 숫자 증가 반복, 숫자 100까지 증가 후 반복문 종료
			// boolean condition1 = (n1 ==3 ) || (n1 ==6) || (n1 ==9 );
			// boolean condition2 = (n10 ==3) || (n10 ==6) || (n10 ==9);
			if ((i>=30 & i<=39) || (i>=60 & i<=69 )||(i>=90 & i<=99)){ // 30 - 39, 60 - 69 , 90 - 99 는 무조건 * 1개는 들어감.
				if (i%10==3 || i%10==6 || i%10==9) { // 그중에서 3,6,9가 한번씩 더 들어가면 * 1개를 더 출력
					System.out.print("*"); // 2번 조건에 따라 추가되는 별
				}
			System.out.print("*\t"); // 1번 조건의 기본별
			} else if (i%10==3 || i%10==6 || i%10==9){ // 박수만 치는 구간 제외한 구간에서 3,6,9 순번마다 별 표시
				System.out.print("* \t");
			} else {
				System.out.print(i + "\t"); // 모든 조건을 만족하지 않을 경우 숫자 표시
			}
			
			if (i%10==0) {
				System.out.println(); // 매 10의 배수마다 엔터키 입력
			}
		}
	}

}
