package edu.java.inheritance06;

import java.util.Objects;

public class Point {
	// field
	private int x;
	private int y;
	
	// constructor (1) 기본 생성자 (2) argument 가 2개인 생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Method
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// toString override: "Point(x=0, y=0)"

	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		
//		return "Point(x=" + this.x + ", y=" + this.y + ")";
//	}
	
	public String toString(int x) {
		x = 0;
		x = this.x + this.y;
		
		
		return "Point = " + x;
	}
	
	public String toString() {
		String s = String.format("Point(x=%d, y=%d)", x,y);
		
		return s;
	}

	@Override
	// hashCode()메서드는 반드시 int 타입을 리턴.
	// equals() 가 true를 return 하는 두 객체는 hashCode()의 리턴값이 같아야 함.
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Point) { // obj가 Point 타입의 Instance 이면,
			Point other = (Point) obj; // 안전한 타입 변환(Casting)
			result = (this.x == other.x) && (this.y == other.y);
		} 
		
		return result;
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass()) // 클래스 이름이 다르면
//			return false;
//		// 클래스 이름이 같으면 -> casting 가능.
//		Point other = (Point) obj;
//		return x == other.x && y == other.y;
	}
	
	

}
