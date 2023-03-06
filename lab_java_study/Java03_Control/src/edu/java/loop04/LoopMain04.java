package edu.java.loop04;

public class LoopMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 1; n <=5 ; n++) {
			System.out.println(n);
			if (n == 3) {
				break; // break가 포함된 가장 가까운 반복문을 종료
			}
		}
		
		System.out.println("=============");
		
		for (int n = 1; n <=5 ; n++) {
			
			if (n == 3) {
				continue; // continue 아래 코드들은 실행하지 않고, 바로 다음 반복위치로 이동해서 수행
			}
			System.out.println(n);
		}
		
		
		
	}

}
