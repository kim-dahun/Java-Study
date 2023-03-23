package edu.java.contact02;

public enum Menu {
	QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE, UNKNOWN;
	
	public static Menu getValue(int select) {
		Menu[] menu = Menu.values();
		if(select>=0 && select<7) {
			return menu[select];
		} 
		
		return menu[6];
	}
}
