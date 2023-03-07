package edu.java.loop10;

import java.util.Scanner;

public class LoopMain10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int balance = 0; // 은행 예금 잔고
		boolean run = true;
		
		while (run) { // true 면 무한 반복해라.
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");
			int r1 = scan.nextInt();
			switch ( r1 ) {
			case 1:
				System.out.println("얼마를 입금하시겠습니까?");
				int r2 = scan.nextInt();
				System.out.println(r2 + " 원이 입금되었습니다.");
				balance += r2;
				System.out.println("현재 잔액은" + balance + " 원 입니다");
				break;
			case 2 :
				System.out.println("얼마를 출금하시겠습니까?");
				int r3 = scan.nextInt();
				if ( r3 > balance) {
					System.out.println("현재 잔액보다 인출하려는 금액이 큽니다");
					break;
				} else {
				System.out.println(r3 + " 원이 출금되었습니다.");
				balance -= r3;
				System.out.println("현재 잔액은" + balance + " 원 입니다");
				break;}
			case 3 : 
				System.out.println("현재 잔액은" + balance + " 원 입니다");
				break;
			case 4 : 
				run = false; // run 값은 true 여서 반복 중이었으나, false 로 바꿔서 반복 멈춤
			default:
				System.out.println("잘못된 입력입니다. 다시 진행하세요.");}
			
			
			
		}
		System.out.println("프로그램 종료");
	}

}
