package test;

import java.util.Map;

public class MineFind {
	public int solution(int[][] board) {
		int a = board.length;
        int answer = a*a;
		int[][] ans = new int[a][a];
		
		
		
		
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
		for(int[] x : board) {
			for(int y : x) {
				if(y==1) {
					answer--;
				}
			}
		}
		return answer;
	}
}


