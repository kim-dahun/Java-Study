package sample.work2;

public class Methodre01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = round(3,5);
		System.out.println(a);
		int num = 5;
		System.out.println(num*5);
	}
	// 원하는 숫자의 n제곱 확인
	public static int round(int roundnum, int number){
		
		int result = number;
		
		
		
		if(roundnum < 2 ) {
			return result;
		} else {
			
			return result*=round(roundnum-1,number);
			// rn =3 => 5*roundnum2{5}*roundnum1{5}
			
			// roundnum3 = 5*roundnum2
			// roundnum2 = 5*roundnum1
			// roundnum1 = 5;
		}
		
			
		
	}
}
