package subproject;

import java.util.Scanner;

public class Reservation {

	// 메서드를 통해 초기화한 필드는 room인스턴스로 넘겨줌.
	double startNum;
	double endNum;

	public Reservation() {

	}

	public void Reserve() { // 예약 관련해서 데이터를 수집하는 메서드
		Scanner scan = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("예약 시작 시간을 입력하세요 >>>");
			startNum = scan.nextDouble();
			if (startNum % 10 > 100 || startNum > 24 || endNum < 0) {
				System.out.println("(0-24시) & 소수 첫째자리 까지만 사용 가능합니다.");

			} else {
				loop = false;
			}

		}
		loop = true;
		while (loop) {
			System.out.println("예약 종료 시간을 입력하세요 >>>");
			endNum = scan.nextDouble();

			if (endNum % 10 > 100 || endNum > 24 || endNum < 0 ) {
				System.out.println("(0-24시) & 소수 첫째자리 까지만 사용 가능합니다.");

			} else {
				loop = false;
			}

		}
		System.out.println("==============================================");
		System.out.println("단위시간 당 금액은 10000원 입니다.");
		System.out.println(((endNum - startNum) * 10000) + " 원 결제해주시면 됩니다.");
		System.out.println("==============================================");

	}
}
