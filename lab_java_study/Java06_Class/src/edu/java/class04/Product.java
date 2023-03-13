package edu.java.class04;


// 클래스의 멤버들 :
// (1) field(필드, 멤버변수)
// (2) constructor(생성자)
// (3) method(기능)
public class Product {
	// 필드
	int productId; // 상품코드
	String productName; // 상품명
	int productPrice; // 상품 가격
	
	// 생성자: 
	// (1) 기본생성자
	// (2) argument 3개를 갖는 생성자 
	// (3) productId, productName을 argument로 갖는 생성자 ( 정의되지 않은 값은 기본값 )
	Product(){
		
	}
	
	Product(int productId, String productName, int productPrice){
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	Product(int productId, String productName){
		this(productId, productName, 0);
	}
	// 메서드 :
	// (1) printProductInfo: 상품의 모든 정보를 콘솔에 출력
	// (2) setProductPrice: 상품의 가격을 전달받은 값으로 변경하는 메서드
	public void printProductInfo() {
		System.out.println("상품코드 : " + this.productId);
		System.out.println("상품명 : " + this.productName);
		System.out.println("상품가격 : " + this.productPrice);
		
		System.out.printf("code : %d, name : %s, price : %d\n",
				this.productId,this.productName,this.productPrice);
		
		System.out.println("===============================");
	}
	/** 
	 * 
	 * @param newPrice : New price What you want to change 
	 */
	public void setProductPrice(int newPrice) {
		System.out.println(this.productName + " 단가가 " + this.productPrice + " 원에서 " + newPrice + " 원으로 변경됩니다.");
		System.out.println("===============================");
		this.productPrice = newPrice;
		this.printProductInfo();
		

	}
	
}
