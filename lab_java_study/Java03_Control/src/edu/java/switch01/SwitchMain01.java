package edu.java.switch01;

public class SwitchMain01 {

	public static void main(String[] args) {
		String time = "점심";
		switch (time) { // switch 사용 시 case는 반드시 1개 이상 필요, default는 선택사항이며, 맨 밑에 작성
		case "아침":
			System.out.println("breackfast");
			break;
		case "점심":
			System.out.println("lunch");
			break;
		case "저녁":
			System.out.println("dinner");
			break;
		default:
			System.out.println("dessert"); 
			// switch-case 구문은 해당 case 위치로 이동해서 break 만날때까지 코드 진행
			// switch-case 구문에서 case에 사용가능한 변수 타입은
			/* 1) 정수 : byte, short, int, long, char
			 * 2) 문자열 : String
			 * 3) enum : 열거형 자료 타입
			 */
			// (주의) swich-case 구문에서 실수 타입(float, double) 은 사용할 수 없음!
		
			/*double x = 1.0;
			switch(x) {
			case 1.0:
				break;
			case 2.0:
				break;
			}*/
		}
		
		

	}

}
