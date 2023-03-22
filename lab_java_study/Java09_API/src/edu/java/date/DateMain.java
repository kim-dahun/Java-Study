package edu.java.date;

import java.time.LocalDate;

public class DateMain {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Java 8 버전에서 새로 추가된 날짜/시간 관련 클래스와 메서드
        LocalDate now = LocalDate.now(); // LocalDate 클래스의 static 메서드 호출.
        System.out.println(now); // LocalDate 클래스는 toString() 메서드를 override.
        System.out.println(now.getYear());
        System.out.println(now.getMonth()); // java.time.Month enum 상수를 리턴.
        System.out.println(now.getMonthValue()); // 월을 숫자(int)로 리턴.
        System.out.println(now.getDayOfWeek()); // java.time.DayOfWeek enum 상수를 리턴.
        System.out.println(now.plusDays(7));
        System.out.println(now.plusWeeks(2));
        
        LocalDate now2 = LocalDate.now();
        now2 = now2.plusDays(7);
        int minusday = (int) now2.compareTo(now); // 날짜 간 차이를 표현. 보관료 계산식이나 악성재고 표현에 사용가능.
        
        
        
        System.out.println(now2.compareTo(now));
        System.out.println(minusday);
        
        LocalDate date = LocalDate.of(2023, 2, 28);
        System.out.println(date);
	}

}
