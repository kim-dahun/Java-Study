package subproject;

import java.util.Scanner;

public class AccountInfo {
	// field
	private int accountNum;
	private String userId;
	private String userPw;
	private int refNum;
	private int reeNum;
	private int count = 1;
	private AccountInfo[] signInbackup = new AccountInfo[count];

	Scanner scan = new Scanner(System.in);

	// constructor
	public AccountInfo() {

	}

	// Method
	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getRefNum() {
		return refNum;
	}

	public void setRefNum(int refNum) {
		this.refNum = refNum;
	}

	public int getReeNum() {
		return reeNum;
	}

	public void setReeNum(int reeNum) {
		this.reeNum = reeNum;
	}

	public AccountInfo[] getSignInbackup() {
		return signInbackup;
	}

	public void setSignInbackup(AccountInfo[] signInbackup) {
		this.signInbackup = signInbackup;
	}

	public AccountInfo[] signIn() { // 회원 가입 메서드
		AccountInfo[] newsignIn = new AccountInfo[count]; // 신규 회원 정보를 받을 배열(기존배열 개수 + 1개)
		AccountInfo[] newsignInBackup = new AccountInfo[count + 1]; // 기존 회원 리스트를 백업 받을 배열 ( 기존배열 개수 + 2개)

		AccountInfo signIn2 = new AccountInfo(); // 기존 배열의 신규 회원 자리를 AccountInfo 타입 변수로 초기화하기 위해 생성
		signInbackup[count - 1] = signIn2; // 기존 배열의 신규회원 자리(count-1) 에 sign2 변수로 초기화
		for (int i = 0; i < count; i++) {
			AccountInfo signIn = new AccountInfo();
			newsignIn[i] = signIn; // 신규 회원 배열을 새로 만들었으므로, 타입 초기화
		}

		for (int i = 0; i < count + 1; i++) {
			AccountInfo signIn = new AccountInfo();
			newsignInBackup[i] = signIn; // 기존 회원 백업 배열도 새로 만들었으므로, 타입 초기화
		}

		for (int i = 0; i < count; i++) {
			newsignInBackup[i] = signInbackup[i]; // 기존 회원 리스트를 백업 배열로 이관
		}
		signInbackup = new AccountInfo[count + 1]; // 기존 회원 리스트 1칸 늘어난 배열 재생성
		for (int i = 0; i < count + 1; i++) {
			AccountInfo signIn = new AccountInfo(); // 기존 회원 리스트 초기화를 위해 AccountInfo 타입 클래스 생성
			signInbackup[i] = signIn; // 클래스 타입 배열원소를 기존 회원 리스트에 넣어서 초기화
			signInbackup[i] = newsignInBackup[i]; // 초기화한 자리에 백업 배열의 자료를 다시 내려받음.
		}
		
		boolean retry = false; // 중복 ID 체크 후 Id 입력 창으로 반복을 돌리기 위한 변수
		boolean onOff = true; // 비밀번호 10자리 미만 체크 후 Pw 입력 창으로 반복문을 돌리기 위한 변수
		System.out.println("회원가입을 시작합니다.");
		while (onOff) {

			System.out.println("아이디를 입력해주세요.");
			String inputId = scan.next();

			for (int i = 0; i < newsignIn.length; i++) { // 아이디 중복 체크를 위한 반복문

				if (inputId.equals(signInbackup[i].getUserId()) == true) { // 아이디를 기존 회원 리스트의 Id 값들과 비교하면서 중복값 체크

					System.out.println("동일한 ID가 존재합니다. 새로운 ID를 생성해야 합니다.");
					retry = true; // 중복값이 존재하면 retry 변수를 true값으로 변경
				}
			}
			if(retry == true) { // retry 가 true 값이면 false로 변경 후 Id 입력창으로 되돌아감.
				retry = false;
				continue;
			}
			
			newsignIn[count - 1].setUserId(inputId); // 중복되지 않았으면 ID 입력값을 신규회원 배열에 입력
			while (onOff) {
				System.out.println("비밀번호를 입력해주세요.");
				String inputPw = scan.next();
				if (inputPw.length() < 10) { // 10자리 미만 체크 후 이상이어야 다음단계 진행
					System.out.println("비밀번호는 10자리 이상 이어야 합니다.");
					continue;
				}
				newsignIn[count - 1].setUserPw(inputPw); // 비밀번호가 10자리 이상이면, 신규회원 배열에 입력
				onOff = false; // 반복 종료
			}
		}

		signInbackup[count - 1] = newsignIn[count - 1]; // 신규 회원 배열의 데이터를 기존 회원 리스트에 입력
		

		count++; // 다음 신규 회원 발생 시 회원을 받기 위해 배열 원소 index 1증가를 위한 count변수 증가

		return signInbackup; // 기존 회원 리스트를 리턴. 회원 리스트 출력이나 Login 메서드에서 활용을 위해.
	}

}
