package edu.java.mvc.menu;

public enum Menu {

	WRITE, MODIFY, DELETE, PRINT_ALL, SEARCH_TITLE, QUIT;
	
	public static Menu getValue(int select) {
		
		Menu[] menu = Menu.values();
		
		
		return menu[select];
		
	}
	
}
