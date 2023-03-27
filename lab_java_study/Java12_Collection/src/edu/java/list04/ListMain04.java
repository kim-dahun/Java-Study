package edu.java.list04;

import java.util.ArrayList;

public class ListMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User 타입 저장하는 ArrayList 타입 변수 선언, 객체 생성.
		ArrayList<User> user = new ArrayList<>();
		// 3개의 User 객체를 ArrayList에 저장.
		user.add(new User("admin","bbbccc"));
		
		User user2 = new User("guest","cccddd");
		user.add(user2);
		
		User user3 = new User();
		
		user.add(user3);
		System.out.println(user);
		user3.setId("guest");
		user3.setPassword("dddeee");
		
		
		
		
		
		System.out.println(user);
		// 저장된 내용을 출력.
		
		// List Users에서 인덱스 0 번 위치의 원소를 삭제
		
		user.remove(0);
		System.out.println(user);
		
		// id가 "guest" 인 user 객체를 리스트에서 삭제
		
		for(int i = 0 ; i<user.size();i++) {
			if(user.get(i).getid().equals("guest")) {
				user.remove(i);
				break;
			}
		}
		
		System.out.println(user);
		
	}

}
