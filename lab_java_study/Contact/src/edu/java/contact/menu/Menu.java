package edu.java.contact.menu;

public enum Menu {
	QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE, UNKNOWN;

	public static Menu getValue(int select) {
		Menu[] menu = Menu.values();
		// -> values(): 모든 enum 클래스가 갖고 있는 static 메서드.
		// -> values의 리턴값 : Enum에서 정의한 열거형 상수들의 배열.
		// {QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE, UNKNOWN}
		if (select >= 0 && select < menu.length) {
			return menu[select];
		}

		
		
		return menu[menu.length - 1];


	}
}
