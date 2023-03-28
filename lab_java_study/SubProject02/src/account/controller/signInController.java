package account.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import account.model.Account;
import account.model.GeneralUser;

public class signInController implements signInUI {
	// singleton
	private static signInController instance;

	// singleton2
	private signInController() {

	}

	// singleton3
	public static signInController getInstance() {
		if (instance == null) {
			instance = new signInController();
		}

		return instance;
	}

	////////////////////////////////////////////

	// field
	private ArrayList<Account> account = new ArrayList<>();
	private int pid = 0;
	
	@Override
	public boolean checkId(String id) {
		// TODO Auto-generated method stub
		boolean result = true;
		
		if(account.size()==0) {
			return false;
		}
		for(int i = 0; i<account.size(); i++) {
			if(id.equals(account.get(i).getUserId())) {
				result = false;
			}
		}

		return result;
	}

	@Override
	public boolean checkPw(String pw) {
		// TODO Auto-generated method stub
		boolean result = true;

		for(int i = 0; i<account.size(); i++) {
			if(pw.equals(account.get(i).getUserPw())) {
				result = false;
			}
		}
		
		return result;
	}
	
	@Override
	public boolean checkEmail(String email) { //
		// TODO Auto-generated method stub
		boolean result = true;
		if(email.matches(".*[@].*")) {
			result=false;
		}
		
		
		return result;
	}
	
	
	
	public boolean signInPw(String pw) {
		// TODO Auto-generated method stub
		boolean result = true;
		
		if(pw.matches(".*[a-z].*") && pw.matches(".*[!@#$%^&*].*") && pw.matches(".*[0-9].*") ){
			
			result = false;
		} 
		return result;
	}

	@Override
	public int SignIn(Account ac) {
		// TODO Auto-generated method stub
		int result = 0;
		if(ac!=null) {
			result =1;
		} 
		account.add(ac);
		
		
		
		return result;
	}

	public void SignInDetail(Account ac) {

	}

}
