package edu.java.inheritance01;

// 상속(inheritance) : 상위 클래스를 확장해서 하위 클래스를 설계하는 것.
// 상위 클래스의 멤버(필드, 생성자, 메서드) 들을 하위 클래스에서 사용할 수 있음.
// 상위 ( Super ) , 부모 ( parent ), 기본 ( base ) 클래스
// 하위 ( Sub ) , 자식 ( child ) , 유도 ( derived ) 클래스

public class InheritanceMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicTv tv1 = new BasicTv();
		tv1.printInfo();
		tv1.powerOnOff();
		tv1.printInfo();
		
		SmartTv tv2 = new SmartTv();
		tv2.powerOnOff(); // 상위 클래스의 메소드를 상속받아서 사용 가능.
		
		tv2.printInfo(); 
		tv2.setIp("192.168.1.102");
		System.out.println(tv2.getIp());
		
		
	}

}
