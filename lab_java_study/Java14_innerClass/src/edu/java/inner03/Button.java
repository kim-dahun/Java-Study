package edu.java.inner03;

public class Button {
	
	// public static 내부 인터페이스
	
	// 내부 인터페이스는 반드시 static 이어야 함. 선언할 때 static 은 생략가능.
	public interface OnClickListener {
		
		void onClick(); // public abstract 생략.
		
		
		
	}
	
	// field 
	private String btnName;
	private OnClickListener listener;
	
	// constructor
	public Button(String btnName) {
		this.btnName = btnName;
	}
	
	// method
	public void setOnClicklistener(OnClickListener listener) {
		
		this.listener = listener;		
	}
	
	public void click() {
		System.out.println(btnName + " 버튼 :");
		listener.onClick();
	}
	
	
	

}
