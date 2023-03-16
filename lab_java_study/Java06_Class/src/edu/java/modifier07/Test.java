package edu.java.modifier07;

public class Test {

	int x; // 인스턴스 필드
	static int y; // static 필드
	
	// 인스턴스 메서드
	public void printInfo() { 
		System.out.println("--- instance Method ---");
		System.out.println("x = " + this.x); // this 생략가능.
		System.out.println("y = " + Test.y); // Test 생략가능.
		//-> 인스터스 메서드는 static 필드/메서드를 사용할 수 있음.
		System.out.println("-----------------------");
	}
	public static void printStaticInfo() {
		System.out.println("--- static Method ---");

	//	System.out.println("x = " + x); //=> static 메서드에서 instance필드,메서들 사용할 수 없기 때문에 에러 발생.
		System.out.println("y = " + y);
		System.out.println("---------------------");

	}
	
}
