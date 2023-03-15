package edu.java.modifier03;

import java.util.Scanner;

// 데이터 캡슐화(encapsulation) :
// 객체의 필드(멤버 변수)들은 private 으로 선언해서 클래스 외부에서 보이지 않도록 감추고,
// 대신, 필요한 경우에 한해서 public 으로 공개가 된 메서드를 제공함으로써
// 간접적으로 필드의 값을 읽거나 수정할 수 있도록 허용하는 프로그래밍 방법.
// getter 메서드 : 필드의 값을 리턴하는 메서드.
// -boolean 타입 필드의 getter 메서드는 get 또는 is 를 붙여서 만듦
// -getter 메서드의 이름은 보통 필드이름 앞에 get 을 붙여서 만듦

// setter 메서드 : 필드의 값을 변경하는 메서드.
// -setter 메서드의 이름은 보통 필드 이름 앞에 set을 붙여서 만듦.
// 데이터 캡슐화를 사용하는 이유는 데이터의 보안과 무결성을 유지하기 위함.

public class ModifierMain03 {

	public static void main(String[] args) {
		User user = new User();
		User[] addUser = new User[1];
		//User[] manNew = user.signIn(addUser);
		
		Scanner scan = new Scanner(System.in);
		// Person 타입의 객체 생성.
		Person p1 = new Person("gil-dong",30);
		//p1.age = -16; // 필드값 변경
		//System.out.println(p1.age); // 필드값 읽기
		
		//private 으로 감춰진 필드의 값 읽기 -> public 으로 공개된 getter 메서드를 사용
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		
		p1.setAge(-17);
		System.out.println("나이 : " + p1.getAge());
		
		User user1 = new User(1,"kdh1","11223344aa");
		String id = user1.getUserId();
		String password = user1.getPassword();
		
		System.out.println("ID : " + id);
		System.out.println("PASSWORD : " + password);
		
		//user1.login(addUser);
		
	}
}
