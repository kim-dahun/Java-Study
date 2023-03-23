package sideproject.warehouse;

public class Product {

	// field
	private int productId;
	private String productName;
	private int each;
	private int weight;

	// constructor

	public Product(int productId, String productName, int each, int weight) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.each = each;
		this.weight = weight;
	}
	
	public Product() {
		
	}

	// method
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getEach() {
		return each;
	}

	public void setEach(int each) {
		this.each = each;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void printInfo() {
		System.out.printf("품목코드 : %d%n",this.productId);
		System.out.printf("품목명 : %s%n",this.productName);
		System.out.printf("품목개수 : %d%n",this.each);
		System.out.printf("품목 개별 중량 : %d%n",this.weight);
		
	}

	
	
}
