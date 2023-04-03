package edu.java.inner03;

import edu.java.inner03.Button.OnClickListener;

public class InnerMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 버튼 객체 생성
		Button btnOpen = new Button("파일 열기");
		
		// 2. 버튼을 클릭했을 때 할 일을 구현
		OpenButtonListener l = new OpenButtonListener(); // 구현 클래스 객체를 생성/
		
		// 3. 버튼에 버튼 클릭 기능을 연결
		btnOpen.setOnClicklistener(l);
		
		// 4. 버튼 클릭
		btnOpen.click();
		
		// 1. button 타입 객체 생성
		Button btnsave = new Button("저장"); // 버튼 타입 객체 생성
		
		
		// 2. 지역 (내부) 클래스
		class SaveButtonListener implements OnClickListener{

			@Override
			public void onClick() {
				// 
				System.out.println("파일 저장...");
			}
			
			
			
		}
		// OnclickListener 타입 객체 생성.
		OnClickListener listener2 = new SaveButtonListener();
		
		//4. Onclicklistener를 버튼의 기능으로 설정.
		btnsave.setOnClicklistener(listener2);
		
		//5. btnSave의 click 메서드 사용 -> btnsave가 가지고 있는 Listener의 onclick 호출
		btnsave.click();
		
		// 지역 클래스 : 선언된 메서드 안에서만 사용 가능(객체 생성).
		// 이름이 없는 클래스: 클래스를 정의하면서 동시에 객체 생성까지 하는 클래스.
		
		Button btnexit = new Button("종료");
		OnClickListener listener3 = new OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("프로그램 종료....");
			}
		};
		btnexit.setOnClicklistener(listener3);
		
		btnexit.click();
		
		Button btnhelp = new Button("도움말");
		
		btnhelp.setOnClicklistener(new OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("도움말!");
			}
		});
		
		btnhelp.click();
		
		Button btnEdit = new Button("편집");
		
		// 람다 표현식 : 추상 메서드가 오직 1개인 인터페이스 구현 클래스를 간단히 표현하는 방법
		btnEdit.setOnClicklistener(()->{System.out.println("파일 편집...");});
		
		btnEdit.click();
		
	}

}
