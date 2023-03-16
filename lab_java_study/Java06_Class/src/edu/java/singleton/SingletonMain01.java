package edu.java.singleton;

public class SingletonMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Captain 타입 변수 선언, Captain 타입 객체를 생성 ( 주소값 할당 ).
		// Captain 생성자는 private 으로 선언되어 있기 때문에 호출할 수 없지만,
		// public static으로 선언된 메서드는 호출할 수 있음.
		
		Captain captain1 = Captain.getInstance();
		System.out.println(captain1.getName());
		System.out.println(captain1);
		
		Captain captain2 = Captain.getInstance();
		System.out.println(captain2.getName());
		System.out.println(captain2);
		captain2.setName("아이언맨");
		
		System.out.println(captain2.getName());
		System.out.println(captain1.getName());
	}

}
