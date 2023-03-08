package sample.work1;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] find = new int[5];
		int[] vsfind = new int[5];
		int max = 0; // 나올 수 있는 최소값 설정
		int min = 10; // 나올 수 있는 최대값 설정
		
		for (int i = 0 ; i < find.length ; i++) {
			find[i] = ran.nextInt(10);
			vsfind[i] = find[i];
			for (int j = 0 ; j < i ; j++){
				if(vsfind[j]==find[i]) {
					
					 // 현재 최고값, 최소값에 영향 안주도록
					System.out.println("중복값 발생");
					i--;
					
				} 
			}
			for(int x : find) {
				System.out.print(x + " ");
			}
			
			if ( max < find[i] ) { // 현재 최대값이 새로 나온 배열 원소보다 작으면, 배열원소로 최대값 교체
				max = find[i];
				
				
			}
			
			if ( min > find[i]) { // 현재 최소값이 새로 나온 배열원소보다 크면, 배열원소로 최소값 교체
				min = find[i];
				
				
			}
			
			
			System.out.println("\n현재 최대값은 " + max);
			System.out.println("현재 최소값은 " + min +"\n");
		}
		
		System.out.println("최종값 >>>");
		for ( int x : find) {
			System.out.print(x + " ");
			
			
		}
		System.out.println();
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
	}

}
