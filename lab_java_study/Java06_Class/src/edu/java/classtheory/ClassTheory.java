package edu.java.classtheory;

public class ClassTheory {
	// Method area(메소드 영역) - Class의 바이트 코드, static 변수/메소드
	// Stack area(스택 영역) - 지역 변수, 매개 변수
	// Heap area(힙 영역) - 인스턴스(클래스 등 객체를 호출하여 생성된 객체)
	
	// Local variable(지역 변수) - 메소드 내에서 정의된 변수
	// parameter(매개 변수) - 메소드를 호출할 때 전달되는 값(argument)를 저장하기 위해 선언한 변수
	// instance(인스턴스) - 클래스를 기반으로 생성된 객체
	
	public static void main(String[] args) {
		System.out.println("====Stack====    ====Heap====    ====Method====");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=============    ============    ==============");
		
		System.out.println("======================▼▼▼======================");
	// BasTv tv1 = new BasTv();
	// BasTv tv2 = new BasTv();
		
		
		System.out.println("====Stack====    ====Heap====    ====Method====");
		System.out.println("=   tv1     =    =tv1.BasTv =    =            =");
		System.out.println("=   tv2     =    =tv2.BasTv =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=           =    =          =    =            =");
		System.out.println("=============    ============    ==============");
		System.out.println("tv1은 tv1.BasTv라는 heap 공간 내의 위치를 참조할 수 있는 지역 변수");
	
	
	
	}
		

	
}
