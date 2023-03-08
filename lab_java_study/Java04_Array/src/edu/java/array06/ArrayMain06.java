package edu.java.array06;

public class ArrayMain06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1차원 배열(문자열)
		String[] newJeans = {"민지","하니","다니엘","해린","혜인"};
		String[] sosi = {"태연", "윤아" , "티파니" , "수영" };
		String[] bts = {"정국", "뷔" , "RM" , "지민" , "슈가" , "제이홉" , "진"};
		
		// 2차원 배열(문자열) : 문자열 배열들을 원소로 받는 배열
		String[][] idols = {newJeans, sosi, bts};
		
		// 2차원 배열에서 length의 의미 : 
		System.out.println(idols.length); // idols의 길이 ( 3 )
		System.out.println(idols[0].length); // idols 배열의 첫번째 행(배열) 의 길이
		System.out.println(idols[1].length); // idols 배열의 두번째 행(배열) 의 길이
		System.out.println(idols[2].length); // idols 배열의 세번째 행(배열) 의 길이
		
		for(int i = 0; i < idols.length ; i++) { // idols 배열 길이만큼 반복
			for( int j = 0 ; j < idols[i].length ; j++) { // idols 내의 각 행별 배열의 길이만큼 반복
				
				System.out.print(idols[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		// for each 구문 사용 필요 시 배열 수 만큼 for문 중첩
		// 배열에서 배열을 꺼내고 그 배열 속 원소를 꺼내는 작업이 필요
		
		for (String[] group : idols) { // 2차원 배열 속 1차원 배열을 꺼냄
			for ( String member : group) { // 1차원 배열 속 원소를 꺼냄
				System.out.print(member + "\t");
			}
			System.out.println();
		}
		
	}

}
