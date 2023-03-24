package sample.work1;

import java.sql.Wrapper;

public class TestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
		
		int n = 6;
		String s1 = "asfoajsdoifjsadoifasdf";
		String[] s2 = new String[s1.length()/n+1];
		
		for(int i=0 ; i<s1.length()/n+1 ; i++) {
			
			if(i==s1.length()/n) {
				s2[i]=s1.substring(i*n, s1.length());
			} else {
				s2[i]=s1.substring(i*n,i*n+6);
			}
			 
		}
		
		for(String s : s2) {
			System.out.print(s + " ");
		}
	}

}
