package test;

public class Solution03 {
	public String solution(String polynomial) {
        String answer = "";
        
        String[] s1 = polynomial.split(" ");
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
