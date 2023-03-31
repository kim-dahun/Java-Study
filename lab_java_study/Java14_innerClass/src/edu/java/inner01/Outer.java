package edu.java.inner01;

import java.util.ArrayList;

public class Outer {

	// field
	private int x;
	private String s;
	private int y;

	// constructor
	public Outer(int y, int x, String s) {
		this.y = y;
		this.x = x;
		this.s = s;
	}

	// method
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return String.format("Outer(x=%d, y=%d, s=%s)", this.x, this.y,this.s);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	// static이 아닌 멤버 내부 클래스(인스턴스 내부 클래스)
	public class Inner{
		//field
		private int y; 
		
		//constructor
		public Inner(int y) {
			this.y = y;
		}
		
		//method
		public void printInfo() {
			
			;
			
			
			
			System.out.println("----Inner 클래스----");
			System.out.println("y = " + y); // 내부 클래스의 멤버 Y ( 이름이 같다면 가까운 필드값을 찾아감 )
			System.out.println("x = " + x); // 내부 클래스는 외부 클래스의 멤버들을 사용할 수 있다.
			System.out.println("s = " + s);
			System.out.println("Outer y + Inner y = " + (Outer.this.y+y)); // 외부 클래스의 필드 불러올 때 -> 클래스명.this.필드명
			s = "s가 아님";
			System.out.println("s = " + s);
		}
	}

}
