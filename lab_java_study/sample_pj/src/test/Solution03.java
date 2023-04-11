package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution03 {
	public String solution(String polynomial) {
        String answer = "";
        
        Set<String> set = new HashSet<>();
        
        String[] players = new String[40];
        
        Map<String,Integer> map = new HashMap<>();
        
        int add = 0;
        map.put(players[1],+add);
        map.keySet();
        List<Integer> ia = new ArrayList<>();
        ia.sort(null);
        
        
        String[] s1 = polynomial.split(" ");
        Arrays.sort(s1);
        int varX = 0;
        int varY = 0;
        for(int i = 0 ; i<s1.length ; i++){
            if(s1[i].contains("x")) {
            	String x = s1[i].replace("x", "");
            	if(s1[i].matches(".*[0-9].*")) {
            		varX += Integer.parseInt(x);
            	} else {
            		varX += 1;
            	}
            } else if (!s1[i].contains("+")){
            	varY += Integer.parseInt(s1[i]);
            }
        }
        
        answer = varX + "x + " + varY;
        
        return answer;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution03 so1 = new Solution03();
		String a = so1.solution("3x + 7 + x");
		System.out.println(a);
	}

}
