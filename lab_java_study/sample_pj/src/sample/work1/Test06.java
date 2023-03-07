package sample.work1;

import java.util.Arrays;
import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개를 저장할 수 있는 배열을 선언
				// 0 이상 9 이하의 정수 난수 5개를 배열에 저장.
				// 배열의 내용을 출력.
				// 배열의 모든 원소의 합을 계산하고 출력.
				// 배열 원소들의 평균을 double 타입으로 계산하고 출력.
		// self-study => 중복값 제거 기능 추가
		// self-study => 배열 순서 정렬
		// 로또 번호 추출기 생성
				
				Random ran = new Random();
				int[] score = new int[6];
				int[] vsscore = new int[6];
				int sum = 0;
				
				for ( int i = 0; i < score.length ; i++) {
					int sc = ran.nextInt(45)+1; 
					score[i] = sc;
					vsscore[i]= sc;
					for (int j = 0; j<i ; j++) {
						if(vsscore[j] == score[i]) {
							score[i]=10;
							i--;
							
						} 
					}
					
					sum = sum + sc;
				}
				
				Arrays.sort(score);
				
				for ( int x : score) {
					System.out.print(x + " ");
					
					
				}
				System.out.println();
				System.out.println("배열 원소의 합계 : " + sum);
				double avg = (double) sum / score.length;
				System.out.println("배열 원소들의 평균은 " + avg);
	}

}
