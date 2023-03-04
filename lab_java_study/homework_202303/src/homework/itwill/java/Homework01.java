package homework.itwill.java;


import java.util.Random;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("가위/바위/보 게임입니다.");
		System.out.println("해당 게임은 계속 비기더라도 최대 10회까지 재경기가 가능합니다. \n\n");
		for (int i=1; i<=10; i++) { // 가위바위보 비겼거나, 잘못된 입력을 한 경우 재경기 가능하도록 10회 반복문
			int com1 = r1.nextInt(3); // com1에 가위바위보 난수 배정
			
			
			System.out.println("============\n[0] 가위 \n[1] 바위 \n[2] 보 \n ============\n 선택하세요>>>");
			int user = sc1.nextInt(); // 유저에게 입력받을 스캐너 설정
			String coms; // com1에 나온 정수를 글자로 표시하기 위해 스트링 선언
			String users; // user 에 나온 정수 이하 상동
			
			if (user<=2 & user >=0) { // 지정된 값 내에서만 입력하도록 범위 설정
				if ( com1 == 0) { // com1의 값을 coms에 글자로 변환
					coms = "가위";
				} else if ( com1 == 1 ) {
					coms = "바위";
				} else {
					coms = "보";
				}
				if (user == 0) { // user의 값을 users에 글자로 변환
					users = " 가위";
				} else if ( user ==1) {
					users = " 바위";
				} else {
					users = "보";
				}
				System.out.println("computer(" + coms + ") : user(" + users + ")");
				
				if ( com1 == 0 ) { // com의 조건에 따라 user가 어떤 값을 냈는지에 따른 분기 설정(조건값1)
					if ( user == 1 ) {
						System.out.println("User의 승리입니다.");
						break;
					} else if ( user ==2) {
						System.out.println("Computer 의 승리입니다.");
						break;
					} else {
						System.out.println("비겼습니다. 재경기를 진행하세요."); // 비겼을 경우 재경기를 진행하라는 메시지 출력
						System.out.println((10-i) + " 회 남으셨습니다."); // 10회 중 현재까지 반복한 i 정수를 감산하여 잔여 횟수 계산
						
					}
				} else if ( com1 == 1) { // 위와 상동(조건값2)
					if ( user == 2 ) {
						System.out.println("User의 승리입니다.");
						break;
					} else if ( user ==0) {
						System.out.println("Computer 의 승리입니다.");
						break;
					} else {
						System.out.println("비겼습니다. 재경기를 진행하세요.");
						System.out.println((10-i) + " 회 남으셨습니다.");
						
					}
				} else if ( com1 == 2) { // 위와 상동(조건값3)
					if ( user == 0 ) {
						System.out.println("User의 승리입니다.");
						break;
					} else if ( user ==1) {
						System.out.println("Computer 의 승리입니다.");
						break;
					} else {
						System.out.println("비겼습니다. 재경기를 진행하세요.");
						System.out.println((10-i) + " 회 남으셨습니다.");
						
					}
				}
			} else {
				System.out.println("잘못된 입력입니다. 게임을 다시 시작합니다.\n게임 진행 가능횟수를 1회 차감합니다."); 
				System.out.println((10-i) + " 회 남으셨습니다.");
			}
			
			System.out.println();
		}
		
		
	}

}
