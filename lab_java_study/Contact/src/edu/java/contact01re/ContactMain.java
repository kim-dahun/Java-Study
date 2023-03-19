package edu.java.contact01re;

import java.util.Scanner;

import edu.java.contact01.ContactMain01;
import edu.java.contact01.Contact;

public class ContactMain {

	private int count = 1;

	private Account[] accList = new Account[count]; // 계정 리스트 무한 생성
	private Account[] accListBackup = new Account[count];
	static private Account newLogin = new Account();

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactMain contMain = new ContactMain();
		System.out.println(" ---- 연락처 프로그램 구동 ---- ");
		boolean run = true;
		while (run) {
			// 프로그램 시작 부분 ( 회원가입 / 로그인 / 종료 )
			int select = contMain.menuSelect();
			switch (select) {
			case (1):
				newLogin = contMain.login();
				if (newLogin == null) {
					continue;
				} else {
					ContactMain01 contma01 = new ContactMain01();
					boolean runMain01 = true;
					while (runMain01) {
						
						// 프로그램 사용 부분 ( 연락처 등록 / 수정 / 삭제 / 검색 / 출력 / 로그아웃 )
						int selectUse = contMain.mainmenuSelect();
						switch (selectUse) {
						case (1):
							contma01.insertNewContact();
							break;

						case (2):
							contma01.modifyContact();
							break;

						case (3):
							contma01.deleteContact();
							break;

						case (4):
							contma01.searchContact();
							break;

						case (5):
							contma01.viewContact();
							break;
						default:
							runMain01 = false;
						}
					}
					
					System.out.println("프로그램 종료 및 로그아웃 진행합니다.");
					newLogin = null;
				}
				continue;
			case (2):

				contMain.signIn();
				continue;

			case (3):
				run = false;

			}

			System.out.println("프로그램 종료");

		}
	}

	public int menuSelect() {
		System.out.println("1. 로그인 / 2. 회원가입 / 3. 종료");
		int select = Integer.parseInt(scan.nextLine());

		return select;
	}

	public Account[] signIn() {

		Account acc = new Account();
		if (count == 1) {
			accList[count - 1] = acc;
			accListBackup[count - 1] = acc;
		}

		accListBackup = new Account[count + 1];
		for (int i = 0; i < count; i++) {

			accListBackup[i] = accList[i];
		}
		accList = new Account[count + 1];
		for (int i = 0; i < count; i++) {
			accList[i] = accListBackup[i];
		}

		System.out.println("ID를 입력해주세요.");
		String input = scan.nextLine();

		if (input.length() < 10) {
			acc.setUserId(input);
			boolean run = true;
			while (run) {
				System.out.println("비밀번호를 입력해주세요.");
				input = scan.nextLine();
				if (input.length() >= 10 && input.length() <= 15) {
					if (input.matches(".*[a-z].*")) {
						acc.setUserPw(input);
						System.out.println("아이디가 생성되었습니다.");

						accList[count - 1] = acc;
						count++;
						return accList;

					} else {
						System.out.println("비밀번호는 반드시 영소문자를 포함해야 합니다.");
						continue;
					}
				} else {
					System.out.println("비밀번호는 10자리 이상 15자리 이하여야 합니다.");
					continue;
				}
			}

		}
		System.out.println("아이디가 10자리가 넘습니다. 다시 가입해주세요.");
		accList[count] = null;
		return accList;
	}

	public Account login() {
		Account nowLogin = new Account();
		System.out.println(accList[0].getUserId());

		if (count == 0) {
			System.out.println("현재 가입된 아이디가 없습니다.");
		} else {
			System.out.println("로그인을 진행합니다.\n");
			System.out.println("ID를 입력해주세요.");
			String input = scan.nextLine();
			System.out.println("비밀번호를 입력해주세요.");
			String inputPw = scan.nextLine();

			for (int i = 0; i < count - 1; i++) {
				if (input.equals(accList[i].getUserId())) {
					if (inputPw.equals(accList[i].getUserPw())) {
						System.out.println("로그인을 완료했습니다.");
						nowLogin = accList[i];
						return nowLogin;

					}
				}
			}
			System.out.println("아이디 혹은 비밀번호를 확인하세요.");
		}

		nowLogin = null;
		return nowLogin;
	}

	public int mainmenuSelect() {
		System.out.println("--- 연락처 관리 모드 ---");
		System.out.println("1. 연락처 등록 / 2. 연락처 삭제 / 3. 연락처 수정 / 4. 연락처 검색 / 5. 전체 리스트 / 6. 종료");
		int select = Integer.parseInt(scan.nextLine());

		return select;
	}

}
