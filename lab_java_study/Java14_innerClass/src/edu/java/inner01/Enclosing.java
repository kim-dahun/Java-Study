package edu.java.inner01;

public class Enclosing {

	public static int var = 123;
	private int x;
	
	public Enclosing(int x) {
		this.x = x;
		
	}
	
	// Enclosing.test() 호출하려는 메서드.
	public static void test() {
		System.out.println(var);
//		Enclosing ec = new Enclosing(2); // static 내에 객체 생성을 해버리면 사용 가능.
//		int a = ec.x; // [멤버 내에 객체 생성 없이는] static 멤버는 다른 static 멤버만 사용가능하다. non-static 멤버들은 사용 불가.
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// 인스턴스(non-static) 메서드는, 인스턴스 변수(non-static field), 클래스 변수(static field) 모두 사용 가능. 
		return String.format("Enclosing(x=%d, static var=%d)",this.x,this.var);
	}
	
	
	//static 내부 클래스 - 외부 클래스의 객체 생성 여부와 관계 없이 생성자를 호출할 수 있음!
	public static class Nested{
		
		private int x;
		private static int var = 246;
		
		public Nested(int x) {
			this.x=x;
		}
		
		public void printInfo() {
			System.out.println("--- static inner class ---");
			System.out.println("x = " + x); // 내부 클래스 멤버 사용.
//			Enclosing ec = new Enclosing(1);
//			System.out.println("Enclosing x = " + ec.x); // 객체 생성 후 클래스명.변수명 으로는 호출 가능
			// -> static 내부 클래스에서는 [객체 생성 없이는] 클래스 외부의 non-static을 사용할 수 없음.
			System.out.println("Enclosing var = " + Enclosing.var);
		}
		
	}
	
}
