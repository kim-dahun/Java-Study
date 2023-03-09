package edu.java.method03;

import java.util.Random;

public class MethodMain03 {

	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		int n1 = rand.nextInt(1,10);
		
		int[] sumarr = new int[n1];
		
		System.out.print("배열 { ");
		for (int i=0; i<sumarr.length; i++) {
			int n2 = rand.nextInt(20);
			sumarr[i]=n2;
			System.out.print(sumarr[i] + " ");
		}
		System.out.print("}\n");
		
		System.out.println("==============================");
		
		System.out.println("배열의 합계 : " + sum(sumarr));
		
		System.out.println("==============================");
			
		System.out.println("배열의 평균 : " + mean(sumarr));
		
		System.out.println("==============================");
		
		System.out.println("배열의 최대값 : " + max(sumarr));
		
		System.out.println("==============================");
		
		System.out.println("배열의 최대값 Index : " + maxAt(sumarr));
		
		System.out.println("==============================");
		
		System.out.println("배열의 최소값 : " + min(sumarr));
		
		System.out.println("==============================");
		
		System.out.println("배열의 최소값 Index : " + minAt(sumarr));
	}

	
	 /**
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
    // TODO
    public static int sum(int[] arr) {
    	int sum = 0;
    	for (int i=0 ; i<arr.length; i++) {
    		sum += arr[i];
    	}
    	
    	return sum;
    }
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균.
     */
    // TODO
    public static int mean(int[] arr) {
    	int sum = 0;
    	int count = 0;
    	
    	for (int i=0; i<arr.length ; i++) {
    		sum+=arr[i];
    		count++;
    	}
    	
    	int mean = sum/count;
    	return mean;
    }
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값.
     */
    // TODO
    public static int max(int[] arr) {
    	int max = 0;
    	for ( int i = 0; i<arr.length ; i++) {
    		if ( arr[i] > max ) {
    			max = arr[i];
    		}
    	}
    	
    	return max;
    }
    /**
     * maxAt
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    // TODO
    public static int maxAt(int[] arr) {
    	int loc1 = 0;
    	int max = arr[0];
    	for (int i = 0 ; i < arr.length ; i++) {
    		
    		if (arr[i]>max) {
    			max = arr[i];
    			loc1 = i;
    		}
    	}
    	
    	return loc1;
    }
    /**
     * min
     * 정수 배열에서 최솟값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값.
     */
    // TODO
    public static int min(int[] arr) {
    	int min = arr[0];
    	for ( int i = 0; i<arr.length ; i++) {
    		if ( arr[i] < min ) {
    			min = arr[i];
    		}
    	}
    	
    	return min;
    }
    /**
     * minAt
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    // TODO
    public static int minAt(int[] arr) {
    	int loc1 = arr[0];
    	int min = arr[0];
    	for (int i = 0 ; i < arr.length ; i++) {
    		
    		if (arr[i] < min ) {
    			min = arr[i];
    			loc1 = i;
    		}
    	}
    	
    	return loc1;
    }
}
