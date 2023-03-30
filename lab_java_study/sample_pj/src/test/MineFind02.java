package test;

import java.util.Set;
import java.util.TreeMap;

class Solution1 {
	public int solution(int[][] board) {
		int answer = 0;
		int a = board.length;

		TreeMap<Integer, Integer> menu = new TreeMap<>();
		for (int i= 0; i< a*a ; i++) {
			menu.put(i, 0);
		}
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (board[i][j] == 1) {
					for (int k = i - 1; k <= i + 1; k++) {
						for (int l = j - 1; l <= j + 1; l++) {
							Integer ace = (l + (k * a) + 1);
							menu.put(ace, 1);
						}
					}
				}
			}
		}
		
		Set<Integer> set = menu.keySet();
		for (Integer x : set) {
			System.out.println(x + "는 " + menu.get(x) + " ");
			if(x>=1 && x<=a*a) {
			if(menu.get(x)==0) {
				
				answer++;
			}
			
			
			}
		}
		System.out.println();
		
		return answer;

	}

}

public class MineFind02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] acc = new int[5][5];
		acc[3][3] = 1;
		

		Solution1 sol = new Solution1();
		int count = sol.solution(acc);
		System.out.println(count);

	}

}
