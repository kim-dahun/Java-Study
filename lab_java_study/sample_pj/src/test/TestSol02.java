package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestSol02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int[] array = {1,2,3,3,3,4};
		int[] array2 = {1,2,2,3,3,4};
		boolean check = true;
		Set<Integer> set = new HashSet<>();
		for(int x : array) {
			set.add((Integer) x);
		}
		ArrayList<Integer> arr = new ArrayList<>();
		for(Integer x : set) {
			arr.add(x);
		}
		
		
		
		int max = 0;
		int maxvs = 0;
		for(int i = 0; i<array.length; i++) {
			
			maxvs = 0;
			for(int j =0; j<array.length ; j++) {
				if(array[i]==array[j]) {
					maxvs++;
				}
				if(maxvs>max) {
					answer=array[i];
					check = false;
				}
				if(maxvs==max && check==false) {
					answer = -1;
					check = true;
				}
			}
		}
		
	}

}
