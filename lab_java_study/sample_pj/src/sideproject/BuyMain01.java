package sideproject;

public class BuyMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddProduct apple = new AddProduct(100,"사과",1000); // 기초 재고 등록
		apple.avgPrice(); // 재고 평균가 표시(이동평균)
		apple.eaProd(); // 재고 자산 갯수 표시
		apple.avgAsset();
		
		apple.buy(600, 200);
		apple.avgPrice();
		apple.eaProd();
		apple.avgAsset();
		
		apple.sell(250);
		apple.avgPrice();
		apple.eaProd();
		apple.avgAsset();
	}

}
