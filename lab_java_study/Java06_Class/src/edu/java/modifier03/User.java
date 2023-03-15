package edu.java.modifier03;

import java.util.Scanner;

public class User {

	// field

	private int userNo;
	public String userId;
	public String password;
	static Scanner scan = new Scanner(System.in);
	public int count = 1;
	User[] user;

	// argument 3개를 갖는 생성자

	public User() {

	}

	public User(int userNo, String userId, String password) {
		this.userNo = userNo;
		this.userId = userId;
		this.password = password;
	}

	// getter, setter Method
	public int getUserNo() {

		return this.userNo;
	}

	public String getUserId() {

		return this.userId;
	}

	public String getPassword() {

		return this.password;
	}

	public void setUserNo(int userNo) {

		if (userNo > 0) {
			this.userNo = userNo;
		} else {
			System.out.println("UserNo는 " + userNo + " 라는 번호를 지원하지 않습니다.");
		}
	}

	public void setUserId(String userId) {

		this.userId = userId;

	}

	public void setPassword(String password) {
		
		this.password = password;

	}

	
	/*public User[] signIn(User[] addUser) {

		User[] newUser = addUser;
		User[] newUserCopy = addUser;

		if (count == newUser.length) {
			count++;
			newUserCopy = new User[count];
			for (int i = 0; i < newUser.length; i++) {
				newUserCopy[i] = newUser[i];
			}
			newUser = new User[count];
			for (int i = 0; i < newUser.length; i++) {
				newUser[i] = newUserCopy[i];
			}
		}

		System.out.println("회원가입을 진행합니다.");
		boolean onOff1 = true;
		while (onOff1) {

			System.out.println("아이디를 입력해주세요.");
			String inputId = scan.next();
			for (int i = 0; i < newUser.length; i++) {
				System.out.println(newUser[i].userId);
				if (newUser[i].getUserId().equals(inputId)==true) {
					System.out.println("이미 중복되는 값이 있습니다.");
					continue;
				}

			}
			newUser[count].setUserId(inputId);
			onOff1 = false;
		}
		onOff1 = true;
		while (true) {
			System.out.println("비밀번호를 입력해주세요");
			String inputPw = scan.next();
			if (inputPw.length() >= 10) {
				newUser[count].setPassword(inputPw);
				System.out.println("정상적으로 회원가입이 완료되었습니다.");
				newUser[count].setUserNo(count - 1);
				onOff1 = false;
				return newUser;
			} else {
				System.out.println("비밀번호는 10자리 이상입니다.");
			}
		}

	}

	public void login(User[] user) {
		boolean onOff4 = true;
		while (onOff4) {
			System.out.println("로그인을 위해 ID를 입력해주세요.");
			String inputId = scan.next();
			for (int i = 0; i < user.length; i++) {
				if (user[i].getUserId() == inputId) {
					while (true) {
						System.out.println("비밀번호 입력해주세요.");
						String inputPw = scan.next();
						if (inputPw.equals(user[i].getPassword())) {
							System.out.println("로그인되었습니다.");
							break;
						} else {
							System.out.println("비밀번호가 틀렸습니다.");

						}
					}
				}

				

			}
			System.out.println("알맞은 아이디가 없습니다.");
			continue;
		}
		boolean onOff = true;
		while (onOff) {
			System.out.println("1. 비밀번호 변경 / 2. 아이디 변경 / 3. 아이디, 비밀번호 확인 / 4. 고유번호 확인");
			int select = scan.nextInt();
			switch (select) {
			case (1):
				System.out.println("변경할 비밀번호를 입력해주세요");
				String newPassword = scan.next();
				this.setPassword(newPassword);
				continue;
			case (2):
				System.out.println("변경할 아이디를 입력해주세요.");
				String newId = scan.next();
				this.setUserId(newId);
				continue;
			case (3):
				System.out.println("ID : " + this.getUserId());
				System.out.println("Password : " + this.getPassword());
				continue;
			case (4):
				System.out.println("UserNo : " + this.getUserNo());
				continue;
			default:
				System.out.println("잘못된 입력입니다. 프로그램 강제 종료");
				onOff = false;
				break;
			}
		} // 회원가입 중복체크 만들기
			// addAcc[] = [무한히 증식하는 배열]
			// addAccRe[] = [데이터를 잠시 복사해두기 위한 배열]
			// 회원가입 실행 시 addAccRe 배열 크기를 한개 늘리고 addAcc[] 배열 데이터를 addAccRe 배열로 옮김.
			// addAcc[] 배열 재생성해서 크기 늘리고 다시 재복사
			// addAcc[] 에 값을 입력받되 반복문을 통해 중복값 체크

	}*/

}
