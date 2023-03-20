package repeat0320;

import java.util.Random;
import java.util.Scanner;

public class RepeatMain01 {
//field
	private static Human[] humanList = new Human[20];
	private static int count;
	
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatMain01 remain = new RepeatMain01();
		
		remain.selectMenu();
		
		
		
		for(int i = 0 ; i<count; i++) {
			humanList[i].printNowInfo();
		}
		
		for(int i = 0 ; i<count-1 ; i++) {
			System.out.println(humanList[i].getName() + " 의 위치와 " + humanList[i+1].getName() + " 의 위치는 같나요? : " + humanList[i].equals((humanList)[i+1]));
			System.out.println(humanList[i].getName() + " 의 해시코드는 : " + humanList[i].hashCode() + " 그리고 " + humanList[i+1].getName() + " 의 해시코드는 : " + humanList[i+1].hashCode());
			
		}
		
	}
	public void selectMenu() {
		RepeatMain01 remain = new RepeatMain01();
		
		boolean run = true;
		while(run) {
		System.out.println("1번 - 사람 입력 / 2번 - 입력값 출력");	
		
		int select = Integer.parseInt(scan.nextLine());
		switch(select) {
		case(1):
			
			remain.checkpoint();
			break;
		case(2):
			run = false;
			break;
		}
		
		}
	}
	
	
	public void checkpoint() {
		if(this.count>19) {
			return;
		}
		
		System.out.println("인적사항 입력 / 이름 , 나이 , 현재 지역");
		Location humanNew = new Human();
		
		System.out.print("이름 >> ");
		((Human)humanNew).setName(scan.nextLine());
		System.out.print("나이 >> ");
		((Human)humanNew).setAge(Integer.parseInt(scan.nextLine()));
		System.out.print("현재 지역 >> ");
		((Human)humanNew).setLocation(scan.nextLine());
		
		((Human)humanNew).setDetailsX(4);
		((Human)humanNew).setDetailsY(rand.nextInt(0,100));
		
		this.humanList[count] = (Human)humanNew;
		count++;
		
	}

}
