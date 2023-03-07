package edu.java.array02;

import java.util.Scanner;

public class ArrayMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 세 개를 저장할 수 있는 배열(names)
		String[] names = new String[3];
		System.out.println(names.length);
		
		Scanner sc = new Scanner(System.in);
		// 배열 names에 문자열을 저장.
		names[0] ="이찬희";
		names[1] ="지대한";
		names[2] ="김다훈";
		//names[3] ="유다한"; // 문법 상 오류는 없지만, 
		//array 생성 시 3자리만 만들었기 때문에 오류가 발생함.
		
		// 배열 names의 내용을 한 줄로 출력
		// (1)for 구문 사용 (2)for-each 구문 사용
		for(int i=2; i>=0; i--) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		for(String y : names) {
			System.out.print(y + " ");
		}
		
		
		String[] subject = {"Java","Sql","Html","JavaScript",null};
		
		for(int i = 0; i<subject.length ; i++) {
			System.out.print(subject[i]+" ");
		}
		
		System.out.print("\n5번째 과목 입력 >>");
		subject[4] = sc.next();
		
		for(int i = 0; i<subject.length ; i++) {
			System.out.print(subject[i]+" ");
		}
		
		
		
	}

}
