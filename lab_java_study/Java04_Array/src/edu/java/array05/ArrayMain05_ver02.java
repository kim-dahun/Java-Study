package edu.java.array05;

import java.util.Random;

public class ArrayMain05_ver02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countM = 0; 
		int countF = 0;
		int count = 10;
		String M = "Male";
		String F = "Female";
		
		Random rand = new Random(); 
		int[] genderCodes = new int[10];
		String[] genders = new String[10];
		
		for ( int i = 0 ; i < count ; i++) {
			genderCodes[i] = rand.nextInt(2);
			if ( genderCodes[i] == 0) {
				genders[i] = M;
				
			} else {
				genders[i] = F;
			}
		
		}
		System.out.println("genderCodes 배열은");
		System.out.print("[ ");
		for ( int x : genderCodes) {
			System.out.print(x + " ");
		}
		System.out.print("]\n");
		
		System.out.println("genders 배열은");
		System.out.print("[ ");
		for ( String x : genders) {
			if ( x.equals(M)) {
				countM++;
			} else {
				countF++;
			}
			System.out.print(x + " ");
		}
		System.out.print("]\n");
		
		System.out.println();
		System.out.println("남성의 수는 " + countM + " 명");
		System.out.println("여성의 수는 " + countF + " 명");
	}

}
