package test;

public class TestMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a = "hello";
	
	char[] chr = a.toCharArray();
	String b = "" +chr[chr.length-1];
	for(int i  = 0 ; i < chr.length-1 ; i++) {
		if(i==0) {
			a = b;
		} 
			a = a+chr[i];
		
	}
	System.out.println(a);
	
	
	int total = 15;
	int num =3;
	 int x = -1;
     int sum = 0;
     boolean run = true;
         
     int[] answer = new int[num];
     while(run){
         for(int i = 0 ; i < num ; i++ ){
             answer[i]=x+i;
             sum += (x+i);
             
         } 
         x++;
         if(sum==total){
            run = false;
         }
         
     }
     
     for(int u : answer) {
    	 System.out.print(u + " ");
     }
	
	}
	

}
