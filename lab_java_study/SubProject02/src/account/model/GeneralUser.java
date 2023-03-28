package account.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneralUser extends Account {

	private LocalDateTime signInTime;
	
	public GeneralUser(int listNum, String userId, String userPw, String userName, LocalDate userBirth,
			int userPersonNum, String userEmail, String userPhone, String userAddress) {
		super(listNum, userId, userPw, userName, userBirth, userPersonNum, userEmail, userPhone, userAddress);
		// TODO Auto-generated constructor stub
		
	}

	public GeneralUser() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSignInTime() {
		this.signInTime = LocalDateTime.now();
	}

}
