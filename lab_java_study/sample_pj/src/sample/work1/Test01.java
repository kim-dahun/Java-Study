package sample.work1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		int num = 0;
		int x1;
		int x2 = 0;
		
		while (true) {
			if(num==3) {
				System.out.println("총합은 " + x2 + " 점 입니다.");
				double x3 = (double) x2/3;
				System.out.println("평균은 " + ((double) x2/3) + " 점 입니다.");
				
				if(x3 > 90) {
					System.out.println("A등급");
				} else if(x3 > 80) {
					System.out.println("B등급");
				}
				else if (x3 > 70) {
					System.out.println("C등급");
				}
				else if (x3 > 60 ) {
					System.out.println("D등급");
				}
				else {
					System.out.println("F등급");
				}
				break;
			}
			System.out.println("과목의 점수를 입력 >>");
			x1 = sc1.nextInt();
			x2 = x2 + x1;
			num++;
			continue;
			
		}
		
		
		
		
			
			
			}
		}
	


