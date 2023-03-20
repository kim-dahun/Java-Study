package edu.java.inheritance06;

class T {

	@Override // java.lang.Object 클래스에서 상속한 toString 메서드를 override
	public String toString() {
		// 객체를 문자열로 변환해서 리턴.
		return "T 타입 인스턴스";
	}
}

public class InheritanceMain06 {

	public static void main(String[] args) {
		// Java.lang.Object 클래스 : 자바의 최상위 클래스.
		// 자바의 모든 클래스는 Object의 protected 또는 public 으로 공개된 멤버(메서드)를
		// 상속받아서 사용 가능하고, 재정의(override) 할 수 있음.
		// Object 클래스의 메서드 재정의 : toString, equals, hashCode, ...

		// System.out.println(Object x) :
		// argument로 전달된 객체의 toString() 메서드가 리턴하는 문자열을 콘솔창에 출력.
		// Class를 정의할 때, toString 메서드를 override 해서 원하는 문자열이 출력될 수 있도록 할 수 있음.
		//
		T t = new T();
		System.out.println(t);

		Point point = new Point();

		point.setX(0);
		point.setY(0);
		System.out.println("point1 = " + point);
		// -> Point 클래스에서 toString() 메서드를 override 하지 않으면,
		// Object 클래스에서 상속받은 toString() 메서드가 리턴하는 문자열을 콘솔창에 출력.
		// -> Point 클래스에서 toString() 메서드를 override(재정의) 하면,
		// println 은 point 클래스에서 재정의된 toString 메서드가 리턴하는 문자열을 콘솔창에 출력.

		Point point2 = new Point(0, 0);
		System.out.println("point2: " + point2);

		System.out.println("== 연산자: " + (point == point2));
		// -> == 연산자는 지역변수 point1의 값과 point2의 값을 비교.
		// 클래스 타입 지역변수가 저장하는 값은 객체가 생성된 힙(heap)의 주소.
		System.out.println("equals 메서드 : " + point.equals(point2));
		// -> equals() 메서드를 override하면, 두 객체가 같은 지에 대한 정의를 새로 내릴 수 있음.

		System.out.println("point hashCode = " + point.hashCode());
		System.out.println("point2 hashCode = " + point2.hashCode());
		// equals가 true를 리턴하는 두 객체(point, point2) 는 hashCode() 리턴 값이 같다

		String s1 = new String("안녕하세요");
		String s2 = new String("안녕하세요");
		System.out.println("== 연산자: " + (s1 == s2));
		// -> 두 문자열이 생성된 주소값을 비교.
		System.out.println("equals 메서드: " + s1.equals(s2));
		// -> java.lang.String 클래스는 equals()를 override(재정의) 하고 있음.

		System.out.println("============= 과제 메인 =================");
		System.out.println();
		System.out.println();

		User user1 = new User();

		System.out.println("user1.toString : " + user1);

		user1.setUserId("ekgns");
		user1.setPassword("ekgnsdl");

		System.out.println("user1 : " + user1);
		
		User user2 = new User("gnsek", "ekgnsl");
		Object obj = new User();//=user2
		
		System.out.println("user2.toString : " + user2);
		User user3 = new User("ekgns", "eiwjofwoi");
		System.out.println("user2.toString : " + user3);
		System.out.println("user1.equals(user2) = " + user1.equals(user2) + ", user1.HashCode = " + user1.hashCode() + ", user2.HashCode = " + user2.hashCode());
		System.out.println("user1.equals(user3) = " + user1.equals(user3) + ", user1.HashCode = " + user1.hashCode() + ", user3.HashCode = " + user3.hashCode());
	}

}
