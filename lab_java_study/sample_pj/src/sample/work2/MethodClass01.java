package sample.work2;

import java.lang.ProcessHandle.Info;
import java.util.Scanner;

class HumanState {
	
	static Scanner scan = new Scanner(System.in);
	
	public String[][] info(int count){ // 학생 정보를 토대로 3개의 배열원소를 갖는 1차원배열을 count 개 갖는 2차원 배열 생성 메서드 
		String arrayHuman[][] = new String[count][3];
		
		for ( int i = 0; i < arrayHuman.length; i++ ) {
			for (int j = 0 ; j < arrayHuman[i].length ; j++) {
				if ( j == 0) {
					System.out.print("이름 >>>");
					arrayHuman[i][j]=scan.next();
				} else if ( j == 1) {
					System.out.print("학교 >>>");
					arrayHuman[i][j]=scan.next();
				} else {
					System.out.print("성별 >>>");
					arrayHuman[i][j]=scan.next();
				}
					
				
			}
		}
		
		return arrayHuman;
	}
}

public class MethodClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		HumanState obj = new HumanState(); //  info 라는 메서드를 활용하기 위해 info 메서드가 있는 HumanState 클래스를 불러옴.
		System.out.println("몇 명의 정보를 입력하시겠습니까?");
		int n = scan.nextInt();
		System.out.println(n + " 명의 정보 입력을 시작합니다. 순서대로 입력해주세요.");
		
		for ( String newHuman[] : obj.info(n)) { // info 메서드를 사용하려면, HumanState를 생성한 obj를 같이 써줘야 인식이 가능함.
			System.out.print("{ ");
			for ( String x : newHuman) {
				System.out.print(x + " ");
			}
			System.out.print("}");
			System.out.println();
		}
		
		System.out.println("학생 " + n + " 명의 데이터베이스가 완성됐습니다.");
		
	}

}
