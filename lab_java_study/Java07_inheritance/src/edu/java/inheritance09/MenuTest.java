package edu.java.inheritance09;

import java.util.Scanner;

enum Menu {
	// enum 상수(public static final 변수) 선언
	QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE, UNKNOWN;

	/**
	 * 정수가 입력되면 그 정수에 해당하는 열거형 상수를 리턴. 0 -> QUIT, 1-> CREATE, 2-> READ_ALL, 3->
	 * READ_BY_INDEX, 4-> UPDATE, 5->DELETE, 0>n,n>5-> UNKNOWN
	 * 
	 * @param n
	 * @return
	 */
	public static Menu getValue(int n) {
		Menu[] menu = Menu.values();
		if (n < 0 || n > 5) {
			return menu[6];
		}

		return menu[n];
	}
}

public class MenuTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

//		Menu m = Menu.QUIT;

		Menu menu = Menu.getValue(n);// 정수(int) 를 전달하면, Menu의 상수들 중 하나를 리턴.
		switch (menu) {
		case QUIT:
			System.out.println(menu.name());
			break;
		case CREATE:
			System.out.println(menu.name());
			break;
		case READ_ALL:
			System.out.println(menu.name());
			break;
		case READ_BY_INDEX:
			System.out.println(menu.name());
			break;
		case UPDATE:
			System.out.println(menu.name());
			break;
		case DELETE:
			System.out.println(menu.name());
			break;
		case UNKNOWN:
			System.out.println(menu.name());
			break;
		}

	}

}
