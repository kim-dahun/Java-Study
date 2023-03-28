package account.controller;

import account.model.Account;
import account.model.GeneralUser;

public interface signInUI {

	boolean checkId(String id);
	
	boolean checkPw(String pw);
	
	boolean checkEmail(String email);
	
	int SignIn(Account ac);
	
	boolean signInPw(String pw);
	
	
}
