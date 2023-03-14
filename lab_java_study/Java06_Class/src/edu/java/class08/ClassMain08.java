package edu.java.class08;

public class ClassMain08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAc1 = new Account(110393800,0);
		Account ac1 = new Account(1231231,1000);
		
		myAc1.printInfo();
		ac1.printInfo();
		
		myAc1.deposit(12000);
		myAc1.printInfo();
		myAc1.withdraw(500);
		myAc1.printInfo();
		myAc1.withdraw(500);
		myAc1.printInfo();
		myAc1.withdraw(500);
		myAc1.printInfo();
		boolean success = myAc1.transfer(1000, ac1);
		System.out.println("이체 성공 여부 : " + success);
		System.out.println("=================================================================");
		myAc1.printInfo();
	}

}
