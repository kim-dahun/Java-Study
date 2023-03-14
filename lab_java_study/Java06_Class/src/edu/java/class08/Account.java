package edu.java.class08;

/*
 * 은행 계좌 클래스
 * 필드 : 계좌번호, 잔액
 * 메서드 : 입금, 출금, 이체, 정보 출력
 */

public class Account {
	int accountNo; // 계좌
	double balance; // 잔고
	
	public Account(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		System.out.println("현재 잔고 " + balance + " 원. " + amount + " 원을 입금합니다.");
		balance += amount;
		System.out.println("최종 잔고 : " + balance + " 원");
		System.out.println("============================================");
		return balance;
	}
	
	public double withdraw(double amount) {
		System.out.println("현재 잔고 " + balance + " 원. " + amount + " 원을 출금합니다.");
		balance -= amount;
		System.out.println("최종 잔고 : " + balance + " 원");
		System.out.println("=================================================================");
		return balance;
	}
	
	public boolean transfer(double amount, Account ac1) {
		boolean result = false;
		System.out.println("[" + this.accountNo + "] 에서 [" + ac1.accountNo + "] 로 " + amount + " 원을 이체합니다.");
		if(amount<balance) {
			this.balance -= amount;
			ac1.balance += amount;
			System.out.println("최종 잔고 : " + balance + " 원");
			System.out.println("상대 잔고 : " + ac1.balance + " 원");
			System.out.println("=================================================================");
			return result=true;
		} else {
			System.out.println("잔고가 부족합니다.");
			System.out.println("=================================================================");
			return result;
		}
		
		
	}
	public void printInfo() {
		System.out.println("계좌번호 : [" + this.accountNo + "] , 해당 계좌의 잔고 : " + this.balance + " 원 입니다.");
		System.out.println("=================================================================");
	}
	
	
}
