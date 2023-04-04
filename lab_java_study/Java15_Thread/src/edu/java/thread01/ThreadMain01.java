package edu.java.thread01;

import javax.sound.midi.ShortMessage;

public class ThreadMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Thread  사용방법 1:
		 * 1. Thread를 상속하는 클래스를 선언(정의)
		 * 2. 상속하는 클래스에서 run() 메서드를 override - 쓰레드가 할 일.
		 * 3. Thread 를 상속하는 클래스의 객체를 생성
		 * 4. 생성된 객체에서 start() 메서드를 호출
		 * 		(주의) override 한 run() 메서드를 직접 호출하면 쓰레드가 실행되지 않음.
		 * 		strat() 메서드 호출 -> 쓰레드가 초기화(메모리 할당, ...) -> run() 메서드 실행.
		 */
		
		// local (inner) class(지역 클래스)
		// (1) Thread를 상속하는 클래스 선언:
		class MyThread extends Thread {
			// field
			private String name;
			
			// Constructor
			public MyThread(String name) {
				this.name = name;
			}
			
			// method
			@Override // (2) run() 메서드를 오버라이딩 
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0 ; i< 100 ; i++) {
					System.out.println(i + " - " + name);
					
					
					try {
						sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // 1000ms = 1초
				}
				
				
			}
			
			
		}
		
		// (3) Thread 를 상속하는 객체 생성
		MyThread th1 = new MyThread("쓰레드");
		MyThread th2 = new MyThread("오샘");
		
		// 쓰레드 시작 전 시간 측정:
		long start = System.currentTimeMillis();
		
		// (4) Thread 를 실행.
		th1.start();
		th2.start();
		
		try {
			// 쓰레드가 종료할 때 까지 Main 쓰레드는 기다림.
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 모든 쓰레드 종료 후 시간 측정
		long end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end-start) + "ms");
		
		System.out.println("***** Main 메서드 종료 *****");
		
	}

}
