package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		// User 타입 변수를 선언, User 타입(클래스) 객체를 생성하고 저장.
		User user1 = new User("acheive","1234abc",27); 
		User user2 = new User("bentz2014","112233aa!",31);
		User user3 = new User("javaman","java102030",32);
		
		// argument 3개 값이 있는 생성자 호출
		
		user1.printUserInfo();
		user2.printUserInfo();
		user3.printUserInfo();
		
		// 기본생성자 호출
		User user4 = new User();
		user4.printUserInfo();
		
		// argument 2개 값만 있는 생성자 호출
		User user5 = new User("audi1010","1q2w3e4r5t");
		user5.printUserInfo();
	}

}
