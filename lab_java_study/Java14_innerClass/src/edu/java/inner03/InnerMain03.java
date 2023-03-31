package edu.java.inner03;

public class InnerMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 버튼 객체 생성
		Button btnOpen = new Button("파일 열기 버튼");
		
		// 2. 버튼을 클릭했을 때 할 일을 구현
		OpenButtonListener l = new OpenButtonListener(); // 구현 클래스 객체를 생성/
		
		// 3. 버튼에 버튼 클릭 기능을 연결
		btnOpen.setOnClicklistener(l);
		
		// 4. 버튼 클릭
		btnOpen.click();
	}

}
