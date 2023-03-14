package subproject;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// 구현하고자 하는 기능
		// 회의실 예약 기능
		// 예약 취소 기능
		// 예약 정보 확인 기능
		// 예약하려는 방의 예약정보 대조해서 중복 예약 막기.

		Room room1 = new Room(); // 회의실 방 4개 인스턴스를 선언;
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Reservation rev = new Reservation(); // 방 예약 관련 메서드를 보유하고 있는 클래스 선언;
		Scanner scan = new Scanner(System.in);

		boolean end = true;
		while (end) {
			System.out.println("기능을 선택하세요");
			System.out.println("1:예약 / 2:예약 정보 확인 / 3:예약 취소 / 4.나가기");

			int select = scan.nextInt();
			switch (select) {
			case (1):
				System.out.println("원하는 방을 선택해주세요.");
				select = scan.nextInt();
				if (select == 1) {
					if (room1.checkroom() == false) { // checkroom() => 방이 예약되어 있는지 확인하고 예약되어 있으면 true return / 아니면
														// false 리턴;
						rev.Reserve(); // 입력값을 받는 메서드.
						room1.name = rev.name; // 받은 입력값을 room 인스턴스의 예약정보에 기입.
						room1.startRev = rev.startNum;
						room1.endRev = rev.endNum;
						System.out.println("1번 방을 예약했습니다.");
					} else {
						System.out.println("이미 예약되어 있습니다.");
						System.out.println("=========1번방=========");
						room1.printroominfo();
					}

				} else if (select == 2) {
					if (room2.checkroom() == false) {
						rev.Reserve();
						room2.name = rev.name;
						room2.startRev = rev.startNum;
						room2.endRev = rev.endNum;
						System.out.println("2번 방을 예약했습니다.");
					} else {
						System.out.println("이미 예약되어 있습니다.");
						System.out.println("=========2번방=========");
						room2.printroominfo();
					}
				} else if (select == 3) {
					if (room3.checkroom() == false) {
						rev.Reserve();
						room3.name = rev.name;
						room3.startRev = rev.startNum;
						room3.endRev = rev.endNum;
						System.out.println("3번 방을 예약했습니다.");
					} else {
						System.out.println("이미 예약되어 있습니다.");
						System.out.println("=========3번방=========");
						room3.printroominfo();
					}
				} else if (select == 4) {
					if (room4.checkroom() == false) {
						rev.Reserve();
						room4.name = rev.name;
						room4.startRev = rev.startNum;
						room4.endRev = rev.endNum;
						System.out.println("4번 방을 예약했습니다.");
					} else {
						System.out.println("이미 예약되어 있습니다.");
						System.out.println("=========4번방=========");
						room4.printroominfo();
					}
				} else {
					System.out.println("잘못된 입력입니다. 방은 4번까지 있습니다.");
				}

				continue;
			case (2):
				if (room1.checkroom() == true) {
					System.out.println("=========1번방=========");
					room1.printroominfo(); // 방의 예약정보에 대해 안내
				}
				if (room2.checkroom() == true) {
					System.out.println("=========2번방=========");
					room2.printroominfo();
				}
				if (room3.checkroom() == true) {
					System.out.println("=========3번방=========");
					room3.printroominfo();
				}
				if (room4.checkroom() == true) {
					System.out.println("=========4번방=========");
					room4.printroominfo();
				}
				if (room1.checkroom() == false && room2.checkroom() == false && room3.checkroom() == false
						&& room4.checkroom() == false) {
					System.out.println("예약한 방이 없습니다.");
				}
				continue;

			case (3):
				System.out.println("예약을 취소할 방을 선택해주세요.");
				int select2 = scan.nextInt();
				if (select2 < 4) {
					if (select2 == 1 && room1.name != null) { // n번방을 선택했을때, 방이 비어 있어야만 cancelroom 메서드 발동.
						room1.cancelroom();
						System.out.println("예약한 방을 취소했습니다.");
					} else if (select2 == 2 && room2.name != null) {
						room2.cancelroom();
						System.out.println("예약한 방을 취소했습니다.");

					} else if (select2 == 3 && room3.name != null) {
						room3.cancelroom();
						System.out.println("예약한 방을 취소했습니다.");

					} else if (select2 == 4 && room4.name != null) {
						room4.cancelroom();
						System.out.println("예약한 방을 취소했습니다.");

					} else {
						System.out.println("예약이 없는 방입니다.");
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
