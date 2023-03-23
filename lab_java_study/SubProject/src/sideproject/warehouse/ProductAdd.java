package sideproject.warehouse;

import java.util.Scanner;

public class ProductAdd extends Product {

	Product[] productList = new Product[1];
	Scanner scan = new Scanner(System.in);
	int listCount = 1;

	public ProductAdd(int productId, String productName, int each, int weight) {
		super(productId, productName, each, weight);
		// TODO Auto-generated constructor stub
	}

	public ProductAdd() {
		// TODO Auto-generated constructor stub
	}

	public Product[] checkList() {
		Product product = new Product();

		if (listCount > 1) {
			Product[] backUpProductList = new Product[listCount];
			for (int i = 0; i < listCount-1; i++) {
				backUpProductList[i] = productList[i];
			}
			productList = new Product[listCount];
			for (int i = 0; i < listCount-1; i++) {
				productList[i] = backUpProductList[i];
			}
			System.out.print("품목명을 입력해주세요.");
			product.setProductName(scan.nextLine());
			System.out.print("품목의 규격 중량을 입력해주세요.");
			product.setWeight(Integer.parseInt(scan.nextLine()));
			setProductId(listCount);
			productList[listCount - 1] = product;
			product.printInfo();
			listCount++;

		} else {
			System.out.print("품목명을 입력해주세요.");
			product.setProductName(scan.nextLine());
			System.out.print("품목의 규격 중량을 입력해주세요.");
			product.setWeight(Integer.parseInt(scan.nextLine()));
			setProductId(listCount);
			productList[listCount - 1] = product;
			product.printInfo();
			listCount++;
		}

		return productList;
	}

}
