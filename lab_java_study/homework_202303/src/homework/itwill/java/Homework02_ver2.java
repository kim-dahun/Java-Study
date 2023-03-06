package homework.itwill.java;

public class Homework02_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		
		for (i=1;i<=333;i++) {
			// 수가 나옴.
			// 반복체크해서 10의 자릿수 체크, 100의 자릿수 체크, 1000의 자릿수 체크...
			int j = i;
			
			while (j/10<0) {
				
				if (j%10==3 || j%10==6 || j%10==9){
					
					System.out.print("*");
				} 
				j/=10;
			}
			
			System.out.print(i);
		
		}
		
		
	}
	
}


