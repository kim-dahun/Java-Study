package sample.work1;

public class Test02 {

	public static void main(String[] args) {
		
		
		int num[] = new int[6];
		
		
		for(int i = 0; i<6; i++) {
			num[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
			
		}
		
System.out.println("로또번호 : ");

for(int i = 0; i<6; i++) {
	System.out.println(num[i] + " ");
}
	}

}
