package edu.java.swing07;

import java.io.Serializable;

// MVC 아키텍쳐에서 Model 객체
public class Score implements Serializable {

	private int korean;
	private int english;
	private int math;
	
	public Score() {
		
	}
	
	public Score(int korean, int english, int math) {
		
		this.korean = korean;
		this.english = english;
		this.math = math;
		
		
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	//TODO : 세 과목의 총점을 int 타입으로 리턴하는 메서드. getTotal()
	public int getTotal() {
		
		return math+korean+english;
	}
	//TODO : 세 과목의 평균은 double 타입으로 리턴하는 메서드 . getMean()
	public double getMean(int sum) {
		// TODO Auto-generated method stub

		return sum/3;
	}
	//TODO : ToString Override ()
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Score [ korean = %d , english = %d , math = %d, 총점 = %d, 평균점 = %f ]", korean,english,math,getTotal(),getMean(getTotal()));
	}
	
	
}
