package edu.java.mvc.menu;

public enum Menu {

	QUIT, WRITE, MODIFY, DELETE, PRINT_ALL, SEARCH_TITLE, UNDEFINED;
	
	public static Menu getValue(int select) {
		
		Menu[] menu = Menu.values();
		
		if(select>=0 && select <6) {
			return menu[select];
		}
		
		
		return menu[6];
		
	}
	
}
