package edu.java.inheritance09;

class Test {
	public static final Test AM = new Test("오전"); // Enum AM과 같음
	public static final Test PM = new Test("오후"); // Enum PM과 같음
	
	private String meaning;
	
	private Test(String meaning) {
		this.meaning = meaning;
	}
}


//enum
// (1) 열거형 상수(들)을 정의하는 특별한 종류의 클래스.
// (2) java.lang.Enum 클래스를 상속하는 하위 클래스.
// (3) field, constructor, method 를 선언(정의)할 수 있음.
// (4) Enum은 생성할 수 있는 Instance 갯수가 정수로 정해져 있는 특별한 클래스.

enum Time{
	AM("오전"), PM("오후");
	
	// field
	private String meaning;
	
	// constructor - enum 생성자는 반드시 private.
	private Time(String meaning) {
		
		this.meaning = meaning;
	}
	
	// Method
	public String getMeaning() {
		return this.meaning;
	}
	
}

public class EnumTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = Time.PM;
		System.out.println(t); // var.toString() 의 리턴 값을 출력.
		System.out.println(t.name()); // Enum 클래스에서 상속받은 메서드.
		System.out.println(t.ordinal()); // Enum 클래스에서 상속받은 메서드
		System.out.println(Time.values()); // Enum 클래스에서 상속받은 static 메서드
		Time[] times =Time.values();
		for (Time x : times) {
			System.out.println(x + " : " + x.getMeaning());
		}
	}

}
