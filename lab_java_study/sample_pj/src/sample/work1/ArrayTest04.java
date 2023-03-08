package sample.work1;

import java.util.Scanner;

public class ArrayTest04 {
	
	public static void main(String[] args) {
		// To-do -> 배열의 1행에는 이름 // 2행에는 학교 // 3행에는 성별 기입
		
	String[][] student = new String[3][3];
	int i = 0;
	int j = 0;
	
	Scanner scan = new Scanner(System.in);
	
	
	for ( i = 0 ; i<student[2].length ; i++) {
		for ( j = 0 ; j < student[2].length ; j++) {
			
			if ( j == 0 ) {
				System.out.println("이름 입력 >>>");
			} else if ( j == 1) {
				System.out.println("학교 입력 >>>");
			} else {
				
				System.out.println("성별 입력 >>>");
			}
			
			student[i][j] = scan.nextLine(); // next 는 뛰어쓰기하면 다른 문자열로 인식. 
			//nextLine 을 해야 그 한 줄 전체를 문자열로 인식
			
		}
		System.out.println();
	}
	
	for ( i = 0 ; i<3 ; i++) {
		for ( j = 0 ; j < 3 ; j++) {
			
			System.out.print(student[i][j] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	}
}
