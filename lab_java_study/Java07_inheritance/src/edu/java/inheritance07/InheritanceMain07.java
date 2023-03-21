package edu.java.inheritance07;

// 추상 메서드(abstract Method):
// 메서드 signature(수식어, 리턴 타입, 메서드 이름, 파라미터 선언) 만 선언되어 있고
// 메서드의 body(본체, { ... }) 가 구현되지 않은 메서드.
// 추상 메서드는 반드시 abstract 키워드로 수식해야 함.
// 추상 메서드 선언은 반드시 세미콜론(;) 으로 끝나야 함.

// 추상 클래스(abstract Class):
// abstract로 선언된 클래스.
// 추상 메서드를 갖는 클래스는 반드시 추상 클래스로 선언해야 한다.
// 추상 클래스는 객체를 생성할 수 없음.

// 추상 메서드와 추상 클래스는 상속하는 하위 클래스에서 메서드 구현을 목적으로 함.


abstract class Animal{ // 추상 클래스
	
	public abstract void move(); // 추상 메서드
}

class Dog extends Animal{ // implement Body{} 를 구현.
	
	@Override // 구현(implementation) : 추상 메서드를 override 해서 메서드 바디를 작성.
	public void move() {
		System.out.println("강아지 총총...");
	}
}

class Fish extends Animal{
	
	@Override
	public void move() {
		System.out.println("물고기 수영수영...");
		// TODO Auto-generated method stub
		
	}
}

class Bird extends Animal{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("새는 훨훨...");
	}
	
}

public class InheritanceMain07 {

	public static void main(String[] args) {
//		Animal animal = new Animal(); 
		// -> 추상 클래스 타입의 객체는 생성할 수 없다(cannot instance).
		
		Dog dog = new Dog();
		// -> 추상 클래스를 구현하는 하위 타입의 객체는 생성할 수 있음.
		dog.move();
		
		Fish fish = new Fish();
		
		Animal animal = fish;
		
		animal.move();
		
		Bird bird = new Bird();
		
		bird.move();
		
		// 다형성 : SuperTyve var = new SubType object();
		Animal[] animals = {bird, fish, dog};
		
		for (Animal x : animals ) {
			x.move();
		}
		
	}

}
