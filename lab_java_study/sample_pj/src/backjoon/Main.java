package backjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int c = Integer.parseInt(scan.nextLine());
		int d = Integer.parseInt(scan.nextLine());
		int e = Integer.parseInt(scan.nextLine());
		int f = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		
		// 13-x + 13-y = 13;
		
		// 37 = (40 -x)(40-x) 
		// Math.sqrt(인수);
		
		// 37 = sqrt(40-i)(40-i)+(0-j)(0-j);
		int count = 0;
		
		
		
		for(int i = -10000 ; i<=10000 ; i++) {
			for(int j = -10000 ; j<10000 ; j++) {
				int disA = ((d-i)*(d-i))+((e-j)*(e-j));
				int disB = ((a-i)*(a-i))+((b-j)*(b-j));
				if(disA==f*f && disB==c*c) {
					count++;
					if(count>2) {
						j=10001;
						i=10001;
						count=-1;
					}
				}
			}
		}
		
		
		System.out.println(count);
		
	}

}
