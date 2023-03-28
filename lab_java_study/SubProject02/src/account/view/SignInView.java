package account.view;

import java.awt.print.PrinterException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import account.controller.signInController;
import account.model.Account;
import account.model.GeneralUser;

public class SignInView {

	LocalDateTime signInTime;
	Scanner scan = new Scanner(System.in);

	public int checkNumException() {
		while (true) {
			try {
				int n = Integer.parseInt(scan.nextLine());
				
				return n;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
			}
		}

		
	}

	public void signInUi() {

		SignInView signInview = new SignInView();
		Account ac = new GeneralUser();
		signInController sign = signInController.getInstance();
		String input = "";
		boolean run = true;
		while (run) {
			System.out.println("==== 회원가입 ====");
			System.out.println("ID를 입력해주세요.");
			input = scan.nextLine();
			run = sign.checkId(input);
			if (run == false) {
				ac.setUserId(input);
				break;
			}
			System.out.println("이미 가입한 ID가 있습니다.");
		}
		run = true;
		while (run) {
			System.out.println("비밀번호를 입력해주세요.");
			input = scan.nextLine();
			run = sign.signInPw(input);
			if (run == false) {
				ac.setUserPw(input);
				break;
			}
			System.out.println("비밀번호는 영문자, 숫자, 특수문자의 조합으로 만들어야 합니다.");
		}
		System.out.println("이름을 입력해주세요.");
		input = scan.nextLine();
		ac.setUserName(input);
		System.out.println("전화번호를 입력해주세요.");
		input = scan.nextLine();
		ac.setUserPhone(input);
		run = true;
		while (run) {
			System.out.println("이메일을 입력해주세요.");
			input = scan.nextLine();
			run = sign.checkEmail(input);
			if (run == false) {
				ac.setUserEmail(input);
				break;
			}
			System.out.println("이메일 형식을 지켜서 입력해주세요.");
		}
		run = true;
		while (run) {

			try {
				System.out.println("생년월일을 입력해주세요. YYYY-MM-NN");
				input = scan.nextLine();
				if (input.length()!=10) {
					System.out.println("잘못된 형식입니다. 재입력해주세요.");
					continue;

				}
				
				LocalDate localDate1 = LocalDate.parse(input);
				System.out.println(localDate1);
				ac.setUserBirth(localDate1);
				run = false;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("다시 입력해주세요. 제대로 된 양식이 아닙니다.");
			}
		}

		run = true;
		while (run) {
			System.out.println("주민번호 뒷자리를 입력해주세요.");
			int inputNum = checkNumException();
			if (inputNum >= 1000000 && inputNum < 9999999) {
				ac.setUserPersonNum(inputNum);
				run = false;
				break;
			}
			System.out.println("주민등록번호는 7자리입니다.");
		}
		
		System.out.println("주소를 입력하세요.");
		input = scan.nextLine();
		ac.setUserAddress(input);
		
		System.out.println("회원가입을 완료하였습니다.");
		sign.SignIn(ac);
	}

}
