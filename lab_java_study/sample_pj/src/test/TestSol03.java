package test;

import java.util.Arrays;

public class TestSol03 {

	public String solution(String my_string) {
		String answer = "";
		int count = 0;

		char[] ch1 = my_string.toCharArray();

		for (int i = 0; i < ch1.length; i++) {

			if (ch1[i] == '*') {
				continue;
			}

			for (int j = 0; j < ch1.length; j++) {

				if (ch1[i] == ch1[j]) {
					if (count == 0) {
						count++;
					} else {
						ch1[j] = '*';
					}
				}

			}
			
			answer = answer + ch1[i];

		}

		return answer;
	}

	public int solution(int[][] dots) {

		int answer = 0;

		return answer;
	}

	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = { 0, 0 };
		for (int i = 0; i < keyinput.length; i++) {
			switch (keyinput[i]) {

			case "up":
				answer[1]++;
				if ((board[1] / 2) < answer[1]) {
					answer[1]--;
				}

				break;
			case "down":
				answer[1]--;
				if ((board[1] / 2) < -answer[1]) {
					answer[1]++;
				}
				break;

			case "right":
				answer[0]++;
				if ((board[0] / 2) < answer[0]) {
					answer[0]--;
				}
				break;
			case "left":
				answer[0]--;
				if ((board[0] / 2) < -answer[0]) {
					answer[0]++;
				}
				break;

			}
		}
		return answer;
	}

//	public String solution(String s) {
//        String answer = "";
//        
//        String[] s1 = s.split(" ");
//        int max = Integer.parseInt(s1[0]);
//        int min = Integer.parseInt(s1[0]);
//        for(int i = 0 ; i<s1.length; i++){
//            int vs = Integer.parseInt(s1[i]);
//            if(min>vs){
//                min = vs;
//            }
//            
//            if(max<vs){
//                max = vs;
//            }
//            
//        }
//        
//        answer = min + " " + max;
//        
//        
//        
//        return answer;
//    }
//	
//	
//	public int solution(int[] array, int n) {
//        int answer = 0;
//        int des = 0;
//        int vsdes = 100;
//        Arrays.parallelSort(array);
//        
//        for(int i = 0 ; i < array.length; i++) {
//        	
//        	if(n>array[i]) {
//        		des = n - array[i];
//        	} else if (n<array[i]) {
//        		des = array[i]-n;
//        	} else if (n==array[i]) {
//        		des = 0;
//        	}
//        	
//        	if(des<vsdes) {
//        		answer = array[i];
//        		vsdes=des;
//        	}
//        	
//        }
//        
//        
//        return answer;
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] keyinput = { "left", "right", "up", "right", "right" };
		int[] board = { 11, 11 };

		int[] array = { 3, 10, 28, 100, 91, 7, 21 };
		int n = 20;
		TestSol03 tssol = new TestSol03();
		int[] res = tssol.solution(keyinput, board);
		System.out.println(res[0] + "," + res[1]);

//		int result = tssol.solution(array, n);
//		
//		String result2 = tssol.solution("1 2 3 4");
//		System.out.println(result2);
//		System.out.println(result);
	}

}
