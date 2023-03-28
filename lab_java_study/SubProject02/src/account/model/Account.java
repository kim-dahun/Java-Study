package account.model;

import java.time.LocalDate;

public abstract class Account {
	//field
	private int listNum;
	private String userId;
	private String userPw;
	private String userName;
	private LocalDate userBirth;
	private int userPersonNum;
	private String userEmail;
	private String userPhone;
	private String userAddress;
	
	
	//constructor
	public Account(int listNum, String userId, String userPw, String userName, LocalDate userBirth, int userPersonNum,
			String userEmail, String userPhone, String userAddress) {
		super();
		this.listNum = listNum;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userBirth = userBirth;
		this.userPersonNum = userPersonNum;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}
	
	public Account() {
		
	}

	//method
	
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(LocalDate userBirth) {
		this.userBirth = userBirth;
	}

	public int getUserPersonNum() {
		return userPersonNum;
	}

	public void setUserPersonNum(int userPersonNum) {
		this.userPersonNum = userPersonNum;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getListNum() {
		return listNum;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d 번 계정 ( ID : %s, PW : %s, 이름 : %s, 생년월일 : %tF)",this.listNum,this.userId,this.userPw,this.userName,this.userBirth);
	}
	
	
	
	
}
