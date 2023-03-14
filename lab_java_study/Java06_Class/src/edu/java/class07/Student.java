package edu.java.class07;

public class Student {
	// field
	int stuNo; // 학번
	String name; // 학생이름
	Score score; // 학생의 시험 점수 ( java, html, sql ), Score 타입의 score 변수 선언
	
	
	// constructor
	// 1) 기본생성자, 2) stuNo, name, score 를 초기화할 수 있는 생성자
	public Student() {
		
	}
	public Student(int stuNo, String name, Score score) {
		
		this.stuNo = stuNo;
		this.name = name;
		this.score=score; // argument를 Score타입으로 받을 것.
	}
	
	public Student(int stuNo, String name, int java, int html, int sql) {
		this.stuNo = stuNo;
		this.name = name;
		this.score = new Score(java,html,sql);
	}
	
	// Method
	// printStudent - 학번, 이름, 세 과목 점수, 평균, 총점 모두 출력하는 메서드
	public void printStudent(int stuGrade) {
		System.out.printf("학번 : %d-%d, 이름 : %s , Java : %d, html : %d, Sql : %d, 평균 : %f, 총점 : %d\n",stuGrade,this.stuNo,this.name,score.java,score.html,score.sql,score.getAverage(),score.getTotal());
		if(score.getAverage()>60 && score.java>40 && score.html >40 && score.sql>40) {
			System.out.println("<<<합격>>>");
		} else {
			System.out.println("<<<불합격>>>");
		}
	}

}
