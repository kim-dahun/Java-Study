package edu.java.contact01re;

public class Account {
	private int listNum;
	private String userId;
	private String userPw;
	
	public Account(int listNum, String userId, String userPw) {
		super();
		this.listNum = listNum;
		this.userId = userId;
		this.userPw = userPw;
	}

	public Account() {
		
	}

	public int getListNum() {
		return listNum;
	}

	public void setListNum(int listNum) {
		this.listNum = listNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public void printInfo() {
		System.out.printf("번호 : %d, 아이디 : %s, 비밀번호 : %s\n",this.listNum,this.userId,this.userPw);
	}
	
}
