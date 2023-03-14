package sample.work3.reserve;

import java.util.Scanner;

public class SelectMenu {
	
	boolean roomrev;
	
	public SelectMenu(RoomInfo roominfo) {
		roomrev=roominfo.roomnum!=0;
	}
	
	public void select() {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 예약 / 2. 조회 / 3. 예약취소 / 4.나가기");
			int select = scan.nextInt();
			
			if (select == 1) {
				System.out.println("몇 번 방을 예약하실건가요?");
				int select2 = scan.nextInt();
				
				switch (select2) {
				case(1):
					
					if(roomrev == true) {
						System.out.println("이미 예약된 방입니다.");
					} else {
						
					}
				}
			} else if (select == 2) {
				
			} else if (select == 3) {
				
			} else if (select >= 4) {
				break;
			}
		}
	}
	
}
