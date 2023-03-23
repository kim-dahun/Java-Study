package edu.java.contact01re;

public enum Menu {
	QUIT, CREATE, DELETE, UPDATE, READ_BY_INDEX, READ_ALL, UNKNOWN;
	
	public static Menu getValue(int select) {
		Menu[] menu = Menu.values();
		if(select>=0 && select<7) {
			return menu[select];
		} 
		
		return menu[6];
	}
}
