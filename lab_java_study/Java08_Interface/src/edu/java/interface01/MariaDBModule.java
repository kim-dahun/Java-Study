package edu.java.interface01;

public class MariaDBModule implements DatabaseModule {

	@Override
	public int select() {
		// TODO Auto-generated method stub
		System.out.println("MariaDB select()");
		return 0;
	}

	@Override
	public int insert(String strVarl, int intVal) {
		// TODO Auto-generated method stub
		System.out.printf("MariaDB insert(%s, %d)\n", strVarl, intVal);
		return 0;
	}

}
