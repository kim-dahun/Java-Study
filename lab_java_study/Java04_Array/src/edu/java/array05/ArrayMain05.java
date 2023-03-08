package edu.java.array05;

import java.util.Random;

public class ArrayMain05 {

	
	
	public static void main(String[] args) {
		// 숫자로 받은 데이터를 문자로 변환해서 배열에 저장하기.
		
		// 성별 : 0 = 남성(Male) / 1 = 여성(Female)
		
		
		// 정수 10개 저장가능한 배열 선언*
		int countM = 0; // 남자 인원 수 체크 변수
		int countF = 0; // 여자 인원 수 체크 변수
		int count = 10;
		Random rand = new Random();
		int[] genderCodes = new int[10]; // 성별을 정수로 받을 배열
		String[] genders = new String[10]; // 정수로 받은 배열을 문자로 치환하여 저장할 배열
		// 난수 ( 0~1 ) 10개 저장;*
		for ( int i = 0; i<count ; i++) {
			genderCodes[i] = rand.nextInt(0,2); // 0<=x<=1 의 정수를 반환
			if ( genderCodes[i]==0) { // 정수 = 0 이면 남성으로 기록, 남성 인원 수 증가
				genders[i] = "Male";
				countM++;
			} else { // 정수 = 1 이면 여성으로 기록, 여성 인원 수 증가
				genders[i] = "Female";
				countF++;
			}
		}
		
		System.out.println("성별코드(정수) 값의 배열은 \n");
		System.out.print("[ ");
		for ( int x : genderCodes) { // 정수로 저장된 성별 배열 출력
			System.out.print(x +" ");
		}
		System.out.print("] \n");
		
		System.out.println("성별(문자열) 값의 배열은 \n");
		System.out.print("[ ");
		for ( String x : genders) { // 문자열로 저장된 성별 배열 출력
			System.out.print("'" + x + "'" +" ");
		}
		System.out.print("] \n");
		
		System.out.println("남자 인원 수는 " + countM + " 명"); // 계산된 남녀 인원수 표기
		System.out.println("여자 인원 수는 " + countF + " 명");
		
		// 배열의 내용을 출력.
		// 문자열 10개 저장가능한 배열 선언
		
		// genderCodes 의 값으로 genders 값을 채워줌.
		// genderCodes 값이 0 이면 "Male" , 값이 1 이면 "Female"을 문자열 배열에 저장
		// 문자열 배열 genders의 내용을 출력.
		// 문자열 배열에 저장된 "Male" 의 개수, "Female"의 개수를 출력.
		// 두 개의 문자열 x, y가 같은지 비교할 때 : x.equals(y);
		
	}

}
