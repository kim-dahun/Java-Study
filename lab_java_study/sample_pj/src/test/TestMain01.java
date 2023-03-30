package test;

import java.util.Random;

class Solution {
	public int solution(int[][] board) {
		int answer = 0;
		int[][] ans = new int[board.length][board.length];
		int a = board.length;

		System.out.println(board[a-1][a-1]);
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (board[i][j] == 1) {
					int k = 0;
					int l = 0;
					if (i == 0) {
						if (j == 0) {
							for (k = i; k <= i + 1; k++) {
								for (l = j; l <= j + 1; l++) {
									ans[k][l] = 1;
								}
							}
						} else if (j < a - 1) {
							for (k = i; k <= i + 1; k++) {
								for (l = j - 1; l <= j + 1; l++) {
									ans[k][l] = 1;
								}
							}
						} else if (j == a - 1) {
							for (k = i; k <= i + 1; k++) {
								for (l = j - 1; l <= j; l++) {
									ans[k][l] = 1;
								}
							}
						}
					} else if (i == a - 1) {
						if (j == 0) {
							for (k = i - 1; k <= i; k++) {
								for (l = j; l <= j + 1; l++) {
									ans[k][l] = 1;
								}
							}
						} else if (j < a - 1) {
							for (k = i - 1; k <= i; k++) {
								for (l = j - 1; l <= j + 1; l++) {
									ans[k][l] = 1;
								}
							}
						} else if (j == a - 1) {
							for (k = i - 1; k <= i; k++) {
								for (l = j - 1; l <= j; l++) {
									ans[k][l] = 1;
								}
							}
						}
					} else if (j == 0 && (i > 0 && i < a - 1)) {
						for (k = i - 1; k <= i + 1; k++) {
							for (l = j; l <= j + 1; l++) {
								ans[k][l] = 1;
							}
						}
					} else if (j == a - 1 && (i > 0 && i < a - 1)) {
						for (k = i - 1; k <= i + 1; k++) {
							for (l = j - 1; l <= j; l++) {
								ans[k][l] = 1;
							}
						}
					} else {

						for (k = i - 1; k <= i + 1; k++) {
							for (l = j - 1; l <= j + 1; l++) {
								ans[k][l] = 1;
							}
						}
					}

				}

			}
		}
		for(int i = 0 ; i<a ; i++) {
			for(int j = 0 ; j<a ; j++) {
				if(ans[i][j]==0) {
					answer+=1;
				}
			}
		}
		return answer;
	}
}

public class TestMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int[][] acc = new int[5][5];
		acc[3][4]=1;
		acc[1][2]=1;

		Solution sol = new Solution();
		int result = sol.solution(acc);
		System.out.println(result);
		String a = "hello";

		char[] chr = a.toCharArray();
		String b = "" + chr[chr.length - 1];
		for (int i = 0; i < chr.length - 1; i++) {
			if (i == 0) {
				a = b;
			}
			a = a + chr[i];

		}
		System.out.println(a);

		int total = 15;
		int num = 3;
		int x = -1;
		int sum = 0;
		boolean run = true;

		int[] answer = new int[num];
		while (run) {
			for (int i = 0; i < num; i++) {
				answer[i] = x + i;
				sum += (x + i);

			}
			x++;
			if (sum == total) {
				run = false;
			}

		}

		for (int u : answer) {
			System.out.print(u + " ");
		}

	}

}
