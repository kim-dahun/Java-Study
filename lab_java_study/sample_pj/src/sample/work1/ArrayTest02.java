package sample.work1;

import java.util.Random;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동전갯수 구하기 배열로 풀어보기
		// 코인배열, 갯수배열 ( 다차원배열로. )
		// i-1 행에는 코인 종류, i 행에는 코인개수 입력
		
		Random rand = new Random();
		int[] coincount = new int[4];
		int money = rand.nextInt(2800)*10;
		int[] coincategory = {650,150,70,10};
		int restMoney = money;
		
		System.out.println("시작 금액은 " + restMoney + " 원 입니다.\n");
		
		for (int i = 0; i < coincount.length; i++) {
			coincount[i] = restMoney/coincategory[i];
			restMoney = restMoney%coincategory[i];
			System.out.println("필요한 " + coincategory[i] + " 원 동전의 개수는 " + coincount[i]);
			System.out.println("잔액은 " + restMoney + " 원");
			System.out.println();
		}
		System.out.println("동전 개수 배열은\n");
		for ( int x : coincount) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		System.out.println("동전 종류 배열은\n");
		for ( int x : coincategory) {
			System.out.print(x + " ");
		}
	}

}
