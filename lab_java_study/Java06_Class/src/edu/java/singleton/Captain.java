package edu.java.singleton;

// singleton(싱클톤) : 오직 한 번만 생성할 수 있는 객체.
// singleton = (1) private static 클래스 필드 + (2) private 생성자 + (3) public static 클래스 메서드


public class Captain {

	private String name = "캡틴 아메리카"; // 인스턴스 필드
	
	// (1) private static Captain 타입의 필드:
	// 생성된 Captain 타입 객체의 주소값을 저장하기 위한 필드.
	// static 으로 선언한 목적 - 프로그램 로딩 시점에 메서드 영역의 메모리에 미리 변수를 만들어 두기 위해서.
	// private 으로 선언한 목적 - 객체의 주소값을 저장한 상황에서 필드값을 다른 클래스에서 변경하지 못하도록 막기 위해서.
	private static Captain instance = null; 
	
	// (2) private 생성자
	// private 선언 이유 - 다른 클래스에서 생성자를 호출할 수 없도록 하기 위해서
	// 다른 클래스에서 객체 생성을 못하도록 막기 위해
	private Captain() {
		
	}
	// (3) public static 이고 Captain 을 리턴하는 메서드
	// public 선언 이유 - 다른 클래스에서 instance를 호출할 수 있도록 하기 위해.
	// static 선언 이유 - Captain 타입 객체가 생성되기 전에도 호출할 수 있도록 하기 위해.
	public static Captain getInstance() {
		if ( instance == null) { // Captain 타입으로 생성된 객체가 없으면,
			instance = new Captain(); // Captain 타입 객체를 생성하고, 그 객체의 주소를 instance에 저장
		}
		
		
		return instance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	
}
