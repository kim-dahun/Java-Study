package edu.java.interface01;

public class OracleDBModule implements DatabaseModule {

	// 인터페이스를 구현하는 클래스 작성 : class [className] implements [InterFaceName] { ... }
	// 구현(implements) : 추상 메서드의 바디를 작성(override).
	
	@Override
	public int select() {
		// TODO Auto-generated method stub
		System.out.println("오라클 데이터 검색");
		return 1;
	}

	@Override
	public int insert(String strVarl, int intVal) {
		// TODO Auto-generated method stub
		System.out.println("오라클 데이터 저장");
		return 1;
	}

}
