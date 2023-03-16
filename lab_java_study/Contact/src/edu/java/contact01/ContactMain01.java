package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {
	// 상수(constant)
	private static final int MAX_LENGTH = 5; // 연락처 배열의 최대 길이(원소 개수)

	// field

	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장할 배열.
	private int count = 0; // 연락처 배열에 현재까지 저장된 연락처의 개수. 배열에 저장될 때마다 값을 증가.
	private Scanner scanner = new Scanner(System.in); // 입력도구

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***** 연락처 프로그램 v0.1 *****");
		ContactMain01 app = new ContactMain01();
		// -> static 이 아닌 메서드들을 사용하기 위해서 참조 변수를 생성.

		boolean run = true;
		while (run) {
			// 메인 메뉴 보여주기
			// 메인 메뉴에서 선택된 값 저장
			int menu = app.showMainMenu();
			// switch (variable) {}
			switch (menu) {
			case (0):
				run = false;
				break;
			case (1): // 새 연락처 저장
				app.insertNewContact();
				break;
			case (2): // 연락처 전체 목록 보여주기
				app.viewContact();
				break;
			case (3): // 배열의 인덱스로 연락처 검색하기
				app.searchContact(); // 아직 만드는 중
				break;
			case (4): // 연락처 이름/전화번호/이메일 정보 수정하기
				app.modifyContact();
				break;
			case (5): // 배열의 인덱스로 연락처 삭제하기
				app.deleteContact();
				break;
			default:
				System.out.println("메인 메뉴 번호를 확인하세요...");
			}
		}

		System.out.println("***** 프로그램 종료 *****");

	}

	public void deleteContact() {
		System.out.println("--- 연락처 삭제 ---");
		System.out.println();
		System.out.println("삭제하고 싶은 연락처의 순번을 입력해주세요.");
		int input = scanner.nextInt();
		for (int i = 1; i < MAX_LENGTH + 1; i++) {
			if (i == input) {
				Contact cleancon = new Contact();
				System.out.println();
				contacts[i - 1] = cleancon;
				System.out.println();
				System.out.println(i + " 번 순서의 연락처를 삭제 완료했습니다.");
				count--;
				break;
			}
		}
	}

	public void modifyContact() {
		System.out.println("--- 연락처 수정 ---");
		System.out.println();
		boolean modifyRun = true;
		while (modifyRun) {
			System.out.println("바꾸고 싶은 연락처의 성함을 입력하세요.");
			String select = scanner.nextLine();

			for (int i = 0; i < count; i++) {
				if (select.equals(contacts[i].getName())) {
					System.out.println(contacts[i].getName() + " 님의 연락처를 수정합니다.");
					System.out.println("이름을 변경해주세요");
					String input = scanner.nextLine();
					contacts[i].setName(input);
					System.out.println("전화번호를 변경해주세요");
					input = scanner.nextLine();
					contacts[i].setPhone(input);
					System.out.println("이메일을 변경해주세요");
					input = scanner.nextLine();
					contacts[i].setEmail(input);
					System.out.println("--- 변경완료 ---");
					modifyRun = false;
				}

			}
			if (modifyRun == true) {
				System.out.println("연락처에 없는 분입니다. 다시 입력해주세요.");
			}

		}

	}

	public void searchContact() {
		System.out.println("--- 연락처 검색 ---");
		boolean find = false;
		System.out.println();
		System.out.print("이름을 검색해주세요>>"); // 인덱스 대신 이름 검색값 받기
		String search = scanner.nextLine();

		for (int i = 0; i < count; i++) { // 배열원소인 Contact 클래스의 Name을 확인해서 일치하는 지 체크
			if (search.equals(contacts[i].getName())) {
				contacts[i].printInfo();
				find = true;
			}
		}
		if (find = false) { // 일치하는 Name이 없으면 연락처가 없다고 표시하고, 마무리
			System.out.println("해당 이름의 연락처는 없습니다.");

		}
		find = false;
	}

	public void viewContact() {
		System.out.println("--- 연락처 목록 ---");
		for (int i = 0; i < count; i++) {
			contacts[i].printInfo();

		}

	}

	public void insertNewContact() {
		if (count >= 5) {
			System.out.println("연락처가 가득 차 더 이상 등록할 수 없습니다.");
		} else {

			System.out.println();
			System.out.println("--- 새 연락처 저장 ---");
			System.out.print("이름을 입력하세요 > ");
			String name = scanner.nextLine(); // 공백을 포함해서 줄바꿈 직전까지 모든 문자열을 읽음.
			System.out.print("전화번호를 입력하세요 > ");
			String phone = scanner.nextLine();
			System.out.print("E-mail을 입력하세요 > ");
			String email = scanner.nextLine();

			// 입력받은 정보들로 Contact 타입의 객체를 생성.

			Contact c = new Contact(0, name, phone, email);

			// Contacts타입 배열에 Contact타입 객체를 저장 // 추가적으로 Count가 아닌 삭제 후 빈자리에 전화번호 넣기.
			contacts[count] = c;

			// 배열에 저장된 원소(연락처) 개수를 1 증가.
			count++;

			System.out.println("새 연락처 저장 성공");

		}
	}

	public int showMainMenu() {
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>");

		int result = Integer.parseInt(scanner.nextLine()); // 문자열을 Int 로 바꿔줌.

		return result;
	}

}
