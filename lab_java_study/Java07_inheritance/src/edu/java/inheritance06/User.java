package edu.java.inheritance06;

public class User {
	// field
	private String userId;
	private String password;
	
	// constructor (1) 기본 생성자 , (2) argument 2개 가진 생성자
	public User() {
		
	}

	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	// getters and setters
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String id) {
		this.userId = id;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	// toString() override : Format : "User(userId=..., password=...)" 하기 전과 후 테스트.
	// return String.format("User(userId=%s, password=%s)",this.userId, this.passowrd)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (this.userId==null) {
			return super.toString();
		}
		
		return "User( userId = " + this.userId + ", password = " + this.password + " )";
	}
	// equals() override : 두 객체의 userId가 같으면 true, 그렇지 않으면 false.
	
	@Override
	public boolean equals(Object obj) { // 
		// TODO Auto-generated method stub
		boolean result = false;
		if ( obj instanceof User) {
			User other = (User) obj;
			if(this.getUserId()==(other).getUserId()) {
				result=true;
			}
		} 
		
		return result;
	}
	
	// hashCode() override.
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int resultHash = 0;
		if ( this.userId ==null) {
			return super.hashCode();
		}
		char[] chArray = new char[this.userId.length()];
		chArray = this.userId.toCharArray();
		
		
		for(int i=0 ; i<chArray.length ; i++) {
			
			int add = (int) chArray[i];
			resultHash += chArray[i];
		}
		resultHash = resultHash+((int)chArray[0]);
		
		return resultHash;
	}
	
	
}
