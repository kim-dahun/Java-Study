package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(10001,"사과",1000); // (int productId, String productName, int productPrice); => argument 3개
		Product product2 = new Product(10002,"배"); // (int productId, String productName); => argument 2개 생성자
		Product product3 = new Product(); // (); => 기본 생성자
		// product1,2,3 은 생성된 객체를 참조하는 변수.
		// 객체가 만들어진 메모리 주소값을 나타냄(정확한 수치는 아님)
		
		product3.productId = 10003; // 기본 생성자는 모두 기본값으로 초기화 되어있으므로, 클래스의 필드들을 원하는 값으로 초기화;
		product3.productName = "새우깡";
		product3.productPrice = 21000;
		
		product1.printProductInfo(); // 정보 출력 메서드 호출
		product2.printProductInfo();
		product3.printProductInfo();
		
		product2.setProductPrice(1700); // 가격 변경 메서드 호출
		product3.setProductPrice(1800);
		
	}

}
