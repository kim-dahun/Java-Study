package edu.java.class07;

public class Score {
	// 필드 - 객체의 속성
	int java; // 자바 과목 시험점수
	int sql; // sql 과목 시험점수
	int html; // html 과목 시험점수
	
	
	// 생성자 - 객체 생성, 객체 속성 초기화
	// (1) 기본 생성자 , (2) argument 3개를 갖는 생성자
	public Score(){
		
	}
	
	public Score(int java, int sql, int html) {
		this.java=java;
		this.sql=sql;
		this.html=html;
	}
	
	
	
	// 메서드 - 객체 기능
	// 1) printScore - 세과목 점수 출력
	public void printScore() {
		System.out.printf("java : %d , html : %d , sql : %d\n",java,html,sql);
		
	}
	
	// 2) getTotal - 세 과목 총점 리턴
	public int getTotal() {
		int result = java + html + sql;
		
		return result;
	}
	// 3) getTotal - 세 과목의 평균(double) 리턴
	public double getAverage() {
		double result = (double)(java+html+sql)/3;
		
		return result;
	}
}
