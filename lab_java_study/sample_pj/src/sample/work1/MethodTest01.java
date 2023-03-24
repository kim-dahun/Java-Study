package sample.work1;

import java.util.Random;
import java.util.Scanner;

public class MethodTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여러 개의 계산 메소드를 가진 계산기 메인 메소드
		// 최대횟수까지 계산을 마치면 순서대로 배열에 정렬.
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int n1 = rand.nextInt(1,5);
		double[] array = new double[n1];
		
	
		
		
		
		for ( int i = 0; i < n1 ; i++) {
			
			System.out.print("첫번째 숫자 입력 >>");
			int a = scan.nextInt();
			System.out.print("무엇을 계산할까요? (1.더하기 / 2. 빼기 / 3. 곱하기 / 4.나누기");
			int c = scan.nextInt();
			System.out.print("두번째 숫자 입력 >>");
			int b = scan.nextInt();
			
			if ( c==1) {
				
				System.out.println(add(a,b));
				array[i]=add(a,b);
			} else if ( c==2) {
				System.out.println(minus(a,b));
				array[i]=minus(a,b);
			} else if ( c==3 ) {
				System.out.println(multiple(a,b));
				array[i]=multiple(a,b);
			} else if ( c==4 ) {
				System.out.println(divide(a,b));
				array[i]=divide(a,b);
			} else {
				System.out.println("잘못된 입력입니다.");
				i--;
			}
			
		}
		System.out.println("배열을 모두 채웠습니다. 출력합니다.");
		System.out.print("{ ");
		for ( double x : array) {
			printAll(x);
		}
		System.out.print("}");
		
	}
	public static double add(int x, int y) {
		return (double)x+y;
	}
	public static double minus(int x, int y) {
		return (double)x-y;
	}
	public static double multiple(int x, int y) {
		return (double)x*y;
	}
	public static double divide(int x, int y) {
		return (double)x/y;
	}
	public static void printAll(double result) {
		System.out.print(result + " ");
	}
	
	

}
