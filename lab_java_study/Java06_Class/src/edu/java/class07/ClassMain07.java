package edu.java.class07;

import java.util.Random;

public class ClassMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int java1 = rand.nextInt(0,101);
		int html1 =rand.nextInt(0,101);
		int sql1 = rand.nextInt(0,101);
		
		Score score = new Score(java1,html1,sql1);
		Student stu1 = new Student(730186,"김철수",score); // int, String, Score타입의 인수 입력 ( score는 직전에 생성한 Score 클래스의 인스턴스 )
		
		
		System.out.println(score.getTotal());
		System.out.println(score.getAverage());
		System.out.println();
		score.printScore();
		stu1.printStudent(14);
		
		
		
		Score score2 = new Score(); // 기본 생성자
		score2.html = rand.nextInt(0,101);
		score2.java = rand.nextInt(0,101);
		score2.sql = rand.nextInt(0,101);
		Student stu2 = new Student(); // 기본 생성자
		stu2.name = "김영희";
		stu2.score = score2; // score 매개변수 자리에 score2 인수
		stu2.stuNo = rand.nextInt(100000,999999);;
		System.out.println();
		score2.printScore();
		stu2.printStudent(12);
		
		stu2.score.getTotal();
		
		System.out.println("===========================");
		String emptyString ="";
		System.out.println("길이 : " + emptyString.length());
		String nullString = null;
		//System.out.println("길이 : " + nullString.length());
		// => nullPointerexception 에러 발생
		// => null : 생성된 객체가 없음.
		// 데이터 타입의 기본값:
		// (1) boolean - false, (2) 정수 - 0 , (3) 실수 - 0.0 , (4) 참조(클래스) 타입 - null;
		
		Student stu3 = new Student(123456, "고길동", 77, 38, 61);
		stu3.printStudent(12);
		
		
	}

}
