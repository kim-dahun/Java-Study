package edu.java.file06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.file05.Product;

public class FileMain06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Product 타입 객체를 1,000,000 개 생성하고, 해당 객체를 ArrayList에 저장.
		ArrayList<Product> products = new ArrayList<>();

		for (int i = 0; i < 1_000_000; i++) { // 천 단위로 _ 언더바 표시.
			Product p = new Product(i, "NAME_" + i, i * 10);

			products.add(p);
		}

		System.out.println("size = " + products.size());

		System.out.println(products.get(999));

		String file = "data/product-list.dat";

		// 1,000,000 개의 원소를 갖는 리스트를 (직렬화해서) 파일에 저장.

		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;

		try {
			out = new FileOutputStream(file); // 파일쓰기 통로
			bout = new BufferedOutputStream(out); // 메모리 쓰기 통로
			oout = new ObjectOutputStream(bout); // 직렬화

			long start = System.currentTimeMillis();
			oout.writeObject(products); // 리스트를 직렬화
			long end = System.currentTimeMillis();

			System.out.println("Write 경과 시간 : " + (end - start) + " ms");
			System.out.println("Write Complete!!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		// 파일에 저장된 데이터를 읽어서 ArrayList<Product> 타입으로 역직렬화.
		try (// 리소스 생성 -> close 자동으로 호출.
				FileInputStream in = new FileInputStream(file);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream oin = new ObjectInputStream(bin);) {
			long start = System.currentTimeMillis(); // 읽기 시작 시간
			ArrayList<Product> products2 = (ArrayList) oin.readObject();
			// -> 데이터를 읽고 역직렬화.
			long end = System.currentTimeMillis(); // 읽기 종료 시간
//				for (Product p : products2) {
//					if(p.getId()==100) {
//						break;
//					}
//					System.out.println(p);
//				}

			System.out.println("Read 경과 시간 : " + (end - start) + " ms");
			System.out.println("size = " + products2.size());
			System.out.println(products2.get(999));
			System.out.println("Read Complete!");
		} catch (Exception e) {
			// TODO: handle exception
		}

		

	}

}
