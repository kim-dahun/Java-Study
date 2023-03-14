package sideproject;

public class AddProduct {
	
	int productEa;
	String productName;
	int productPrice;
	int productPriceAvg;
	
	AddProduct(int productEa, String productName, int productPrice){
		this.productEa = productEa;
		this.productName = productName;
		this.productPrice = productPrice;
		productPriceAvg = (productPrice*productEa);
	}
	
	public void buy(int newPrice, int addEa) {
		System.out.println(this.productName + " 를 " + addEa + " 개, 구매했고 자산 EA 당 " + newPrice + " 원에 증가했습니다.");
		this.productEa += addEa;
		this.productPriceAvg += addEa*newPrice;
		this.productPrice = productPriceAvg/productEa;
	}
	
	public void sell(int minusEa) {
		
		this.productEa -= minusEa;
		System.out.println(this.productName + " 를 " + minusEa + " 개, 판매했고 "  + "자산 EA 당 "+ this.productPrice + " 원에 감소했습니다.");
		this.productPriceAvg -= minusEa*productPrice;
		this.productPrice = productPriceAvg/productEa;
		
	}
	
	public void eaProd() {
		System.out.printf("현재 %s 의 재고 개수는 %d 개 입니다.\n",productName,productEa);
	}
	
	public void avgPrice(){
		
		System.out.printf("현재 %s 의 평균단가는 (%d) 원 입니다.\n",productName,productPriceAvg/this.productEa);
	}
	
	public void avgAsset() {
		System.out.println((productPriceAvg) + " 원이 재고자산가액 입니다." );
		System.out.println("==============================================");
	}
	
}
