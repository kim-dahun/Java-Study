package subproject;

import java.util.Scanner;



public class MainMethod {

	public static void main(String[] args) {
		// 구현하고자 하는 기능
		// 회의실 예약 기능
		// 예약 취소 기능
		// 예약 정보 확인 기능
		// 예약하려는 방의 예약정보 대조해서 중복 예약 막기.
		Scanner scan = new Scanner(System.in);
		
		
		AccountInfo acc1 = new AccountInfo();
		AccountInfo acc2;
		boolean start = true;
		while(start) {
		System.out.println("====== 회의실 예약 =====");
		System.out.println();
		System.out.println("1. 회원가입  2. 로그인  3. 종료");
		int selectNew = scan.nextInt();
		if(selectNew==1) {
			acc1.signIn();
			continue;
		} else if(selectNew==2) {
			acc2 = acc1.login();
		} else if(selectNew==3) {
			System.out.println("시스템 종료합니다.");
			break;
		} else {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		
		
		
		
		
		Room[] a1 = new Room[4]; // Room Class 배열 생성
		
		
		for (int i = 0; i<a1.length; i++) { // 클래스 배열 인덱스 길이만큼 배열원소로 클래스를 생성해서 받음
			int roomNum = i+1;
			String name = null;
			double startTime = 0.0;
			double endTime = 0.0;
			
			Room r1 = new Room(roomNum,name,startTime,endTime); // Room Class 의 인수로 방번호, 예약자, 대여 시작시간, 종료시간 받음
			a1[i] = r1;
		}
		Reservation rev = new Reservation(); // 방 예약 관련 메서드를 보유하고 있는 클래스 선언;
		

		boolean end = true;
		while (end) {
			System.out.println("기능을 선택하세요");
			System.out.println("1:예약 / 2:예약 정보 확인 / 3:예약 취소 / 4.나가기");

			int select = scan.nextInt();
			switch (select) {
			case (1):
				System.out.println("원하는 방을 선택해주세요.");
				int select3 = scan.nextInt();
				for ( int i = 1; i<=select3 ; i++) {
					if(select3==i && a1[i-1].name ==null) {
						rev.Reserve();
						a1[i-1].name = acc2.getUserName();
						a1[i-1].roomNum = i;
						a1[i-1].startTime = rev.startNum;
						a1[i-1].endTime = rev.endNum;
						a1[i-1].id = acc2.getUserId();
						break;
					} 
				}
				if ( select3 > 4) {
					System.out.println("잘못된 입력입니다. 방은 4번까지 있습니다.");

				}
				continue;
			case (2):
				for ( int i = 0 ; i<a1.length; i++) {
					System.out.println("=============================");
					if(a1[i].checkroom()==true) {
						a1[i].printroominfo();
					} else {
						System.out.println(a1[i].roomNum + "번 방은 예약이 없습니다.");
					}
					System.out.println("=============================");
				}
			
				continue;

			case (3):
				System.out.println("예약을 취소할 방을 선택해주세요.");
				int select2 = scan.nextInt();
				if (select2 < 5) {
					int i = 0;
					while(true) {
						
						i++;
						if(i==select2-1) {
							if(a1[i].name == null) {
								System.out.println("예약자가 없습니다.");
							} else {
								
								a1[i].cancelroom();
							}
							break;
						}
					}
				} else {
					System.out.println("없는 방입니다.");
				}
				continue;

			case (4):
				System.out.println("시스템을 종료합니다.");
				end = false; // true 값을 false로 바꿔서 무한루프 탈출

			}

		}
		
		}
	}
}
