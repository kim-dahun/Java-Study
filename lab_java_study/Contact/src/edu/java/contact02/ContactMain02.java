package edu.java.contact02;

import java.util.Arrays;

//2023-03-17 ERROR 발생 관련 상황에 대해 고민.

import java.util.Scanner;
import edu.java.contact.menu.Menu;

public class ContactMain02 {
	// 상수(constant)
	private static final int MAX_LENGTH = 5; // 연락처 배열의 최대 길이(원소 개수)

	// field

	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장할 배열.
	private int count = 0; // 연락처 배열에 현재까지 저장된 연락처의 개수. 배열에 저장될 때마다 값을 증가.
	private Scanner scanner = new Scanner(System.in); // 입력도구

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		System.out.println("***** 연락처 프로그램 v0.2 *****");
		ContactMain02 app = new ContactMain02();
		// -> static 이 아닌 메서드들을 사용하기 위해서 참조 변수를 생성.

		boolean run = true;
		while (run) {
			// 메인 메뉴 보여주기
			// 메인 메뉴에서 선택된 값 저장
			int select = app.showMainMenu();
			Menu menu = Menu.getValue(select);
			
			// switch (variable) {}

			switch (menu) {
			case QUIT:
				run = false;
				break;
			case CREATE: // 새 연락처 저장
				app.insertNewContact();
				break;
			case READ_ALL: // 연락처 전체 목록 보여주기
				app.viewContact();
				break;
			case READ_BY_INDEX: // 배열의 인덱스로 연락처 검색하기
				app.selectContactByIndex();
				break;
			case UPDATE: // 연락처 이름/전화번호/이메일 정보 수정하기
				app.updateContactByIndex();
				break;
			case DELETE: // 배열의 인덱스로 연락처 삭제하기
				app.deleteContact();
				break;
			default:
				System.out.println("메인 메뉴 번호를 확인하세요...");
			}
		}

		System.out.println("***** 프로그램 종료 *****");

	}

	public void deleteContact() { // 내가 만든것
		System.out.println("--- 연락처 삭제 ---");
		System.out.println();
		boolean run = true;
		int inputNum = 0;
		while (run) {
			System.out.println("삭제하고 싶은 연락처의 순번을 입력해주세요.");

			inputNum = inputNumber();

			run = false;
		}
		if (inputNum < 1 || inputNum > count) {
			System.out.println("범위를 벗어난 입력입니다.");
			return;
		}

		for (int i = inputNum - 1; i < count; i++) {
			if (i == count - 1) {

				contacts[i] = null;
			} else {
				contacts[i] = contacts[i + 1];
			}
			// 삭제한 위치까지 뒤에서부터 데이터를 당겨옴

		}

		count--;
		System.out.println();
		System.out.println(inputNum + "번 순서의 연락처 삭제했습니다.");

	} // 내가 만든것 끝

//	public void modifyContact() { // 내가 만든것
//		System.out.println("--- 연락처 수정 ---");
//		System.out.println();
//		boolean modifyRun = true;
//		while (modifyRun) {
//			System.out.println("바꾸고 싶은 연락처의 성함을 입력하세요.");
//			String select = scanner.nextLine();
//
//			for (int i = 0; i < count; i++) {
//				if (select.equals(contacts[i].getName())) {
//					System.out.println(contacts[i].getName() + " 님의 연락처를 수정합니다.");
//					System.out.println("이름을 변경해주세요");
//					String input = scanner.nextLine();
//					contacts[i].setName(input);
//					System.out.println("전화번호를 변경해주세요");
//					input = scanner.nextLine();
//					contacts[i].setPhone(input);
//					System.out.println("이메일을 변경해주세요");
//					input = scanner.nextLine();
//					contacts[i].setEmail(input);
//					System.out.println("--- 변경완료 ---");
//					modifyRun = false;
//				}
//
//			}
//			if (modifyRun == true) {
//				System.out.println("연락처에 없는 분입니다. 다시 입력해주세요.");
//			}
//
//		} 
//
//	} // modify 끝

	public void updateContactByIndex() { // 선생님
		System.out.println();
		boolean run = true;
		int index = 0;
		System.out.println("--- 연락처 수정 ---");
		while (run) {

			System.out.print("수정할 연락처 인덱스 입력>");

			index = inputNumber();

			if (index > (count - 1) || index < 0) {
				System.out.println("잘못된 입력값입니다.");
				continue;
			}

			System.out.print("수정 전: ");
			System.out.println(contacts[index]);

			System.out.print("수정할 이름을 입력>");
			String name = scanner.nextLine();
			System.out.println("수정할 전화번호 입력>");
			String phone = scanner.nextLine();
			System.out.println("수정할 E-mail>");
			String email = scanner.nextLine();

			// 수정할 인덱스의 정보를 업데이트

			contacts[index].setName(name);
			contacts[index].setPhone(phone);
			contacts[index].setEmail(email);

//		contacts[index] = new Contact(0,name,phone,email);

			System.out.println("수정 후: ");
			System.out.println(contacts[index]);
			run = false;
		}
	} // 선생님 끝

//	public void searchContact() { // 내가 짠것
//		System.out.println("--- 연락처 검색 ---");
//		boolean find = false;
//
//		System.out.println();
//		System.out.print("이름을 검색해주세요>>"); // 인덱스 대신 이름 검색값 받기
//		String search = scanner.nextLine();
//
//		for (int i = 0; i < count; i++) { // 배열원소인 Contact 클래스의 Name을 확인해서 일치하는 지 체크
//			String check = contacts[i].getName();
//			if (check.matches(".*" + search + ".*")) {
//				contacts[i].printInfo();
//				find = true;
//			}
//		}
//		if (find == false) { // 일치하는 Name이 없으면 연락처가 없다고 표시하고, 마무리
//			System.out.println("해당 이름의 연락처는 없습니다.");
//
//		}
//		find = false;
//
//	} // 내가 짠것 종료

	public void selectContactByIndex() {
		System.out.println();
		System.out.println("--- 인덱스 검색 ---");
		System.out.print("검색할 인덱스 입력> ");
		int index = inputNumber();

		if (index >= 0 && index < count) {
			System.out.println(contacts[index]);
			
		} else {
			System.out.println("해당 인덱스에는 연락처 정보가 없음...");
		}

	}

	public void viewContact() {
		System.out.println("--- 연락처 목록 ---");
		for (int i = 0; i < count; i++) {
			System.out.println(contacts[i]);

		}

	}

	public void insertNewContact() {
		if (count >= MAX_LENGTH) {
			System.out.println("연락처가 가득 차 더 이상 등록할 수 없습니다.");
			return; // void 에서 return은 그냥 메서드를 종료시키겠다
		}

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

	public int showMainMenu() {

		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("---------------------------------------------------------");
		System.out.println("선택>");

//		int result=scanner.nextInt();
		
		int result = inputNumber();
		

		return result;
	}

	public int inputNumber() {

		while (true) {
			try {
				int n = Integer.parseInt(scanner.nextLine());
				return n; // return: (1) 값을 메서드 호출한 곳에 반환. (2) 메서드 종료.
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력 >>>");
			}

		}
	}

}
