package backjoon;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		String[] a1 = new String[test];
		int[] result = new int[test];
		for(int k = 0 ; k<test ; k++) {
		a1[k]=scan.nextLine();
		
		String[] s1 = a1[k].split(" ");
		
		int a = Integer.parseInt(s1[0]);
		int b = Integer.parseInt(s1[1]);
		int c = Integer.parseInt(s1[2]);
		int d = Integer.parseInt(s1[3]);
		int e = Integer.parseInt(s1[4]);
		int f = Integer.parseInt(s1[5]);
		
		start = System.currentTimeMillis();
		int maxLeng = 0;
		if(c>f) {
			maxLeng = c;
		} else {
			maxLeng = f;
		}
		
		
		
		for(int i = -maxLeng ; i<=maxLeng ; i++) {
			for(int j = -maxLeng ; j<maxLeng ; j++) {
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
		
		result[k]=count;
		count=0;
		}
		
		scan.close();
		
		for(int y : result) {
			System.out.println(y);
		}

		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		
	}

}
