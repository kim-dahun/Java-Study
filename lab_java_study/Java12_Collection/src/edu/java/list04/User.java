package edu.java.list04;

public class User {
	//field
	private String id;
	private String password;
	
	//Constructor
	public User() {
		
	}
	// 기본생성자
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	// argument 2개를 갖는 생성자
	public String getid() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	// getter, setter 메서드
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("계정 정보 [ 아이디 : %s , 비밀번호 : %s ]", this.id , this.password);
	}
	
	// toString Override
	
	
}
