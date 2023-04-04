package solution;

public class Solution {

	public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean run = false;
        for(int i = 0 ; i < db.length ; i++){
            for(int j = 0 ; i < db[i].length; j++){
                if(db[i][0].equals(id_pw[0])){
                    if(db[i][1].equals(id_pw[1])){
                        answer = "login";
                        return answer;
                    } else {
                        run = true;                   
                    }
                }
            }
        }
        
        if(run = true){
         answer = "wrong pw";   
        } else {
        answer = "fail";
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
