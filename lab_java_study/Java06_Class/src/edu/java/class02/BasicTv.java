package edu.java.class02;

// 클래스(class): 프로그램에서 필요한 데이터와 기능을 묶어서 하나의 
// "데이터타입" 으로 정의 한 것

// 데이터 -> 필드(field), 멤버 변수, 속성(property)

// 데이터 타입 -> 변수 선언, 파라미터 선언, 메서드 리턴 타입 선언.
// 클래스 선언 : [수식어] class 클래스이름 { ... }
// 클래스 이름 작성 : 영문자, 숫자, _, $를 사용할 수 있음
// 숫자로 시작할 수 없음.
// 대문자로 시작하는 camel 표기법을 권장.

public class BasicTv {
	//field - 클래스의 모든 메서드에서 활용 가능.
	
	boolean powerOn; // TV 전원상태 저장 필드 ( true : On / false : Off )
	int volume; // Tv의 현재 음량을 저장하는 필드
	int channel; // Tv의 현재 채널을 저장하는 필드
	private static final int max = 5;
	private static final int min = 0;
	
	BasicTv(int a, int b){
		
	}
	
	BasicTv(){
		
	}
	
	
	
	//Tv 켜기 & 끄기
	public void onOff() {
		if (powerOn) { // Tv가 켜져 있으면
			System.out.println("TV OFF"); // TV 종료
			powerOn=false;
			
		} else {
			System.out.println("TV ON");
			powerOn=true;
			
		}
		
		
	}
	
	// 볼륨 올리기
	public void volumeUp(int up) {
		if (powerOn == false) {
			System.out.println("TV가 꺼져 있습니다.");
		} else {
			if (volume>max) {
				System.out.println("더 이상 높일 수 없습니다.");
				volume=max;
				System.out.println("현재 볼륨 :" + volume);
				
			} else 	if (up>=1) {
				volume +=1;
				System.out.println("볼륨 :" + volume);
				volumeUp(up-1);
			}  else {
				System.out.println("현재 볼륨 :" + volume);
				
			}
		}
		
				
		
	}
	
	// 볼륨 낮추기(입력한 수치만큼 낮아지며, 일정 이하로 내려갈 수 없음 )
	public void volumeDown (int down) {
		if (powerOn == false) {
			System.out.println("TV가 꺼져 있습니다.");
		} else {
		
		if (volume<min) {
			System.out.println("더 이상 낮출 수 없습니다.");
			volume=min;
			System.out.println("현재 볼륨 :" + volume);		
			
			
		} else if (down>=1) {
			volume -=1;
			System.out.println("볼륨 :" + volume);
			volumeDown(down-1);
		} else {
			System.out.println("현재 볼륨 :" + volume);
			
		}
		}
	}
	
	// 채널 변경하기( 100개의 채널을 가지고 있음, 넘어가면 다시 1부터 )
	public void channelup (int up) {
		if (powerOn == false) {
			System.out.println("TV가 꺼져 있습니다.");
		} else {
		
		if ( channel >= max && up!=0) {
			channel-=max;
		}
		
		if ( up <= 0 ) {
			System.out.println("현재 채널 : " + channel);
			
		} else {
			channel++;
			System.out.println("채널 :" + channel);
			channelup(up-1);
			
			
		}
		
		}
		
	}
	
	public void channelup2 (int up) {
		if ( channel >=100 && up!=0) {
			channel-=100;
		}
		
		if (up <= 0) {
			System.out.println("현재 채널 :" + channel);
		} else {
			channel++;
			System.out.println("채널 : " + channel);
			channelup2(up-1);
		}
	}
	
	public void channeldown (int down) {
		if (powerOn == false) {
			System.out.println("TV가 꺼져 있습니다.");
		} else {
			if ( down !=min && channel <=1) {
				channel+=5;
			}
			
			if (down > min) {
				channel--;
				System.out.println("채널 : " + channel);
				
				channeldown(down-1);
				
				
			} else {
				System.out.println("현재 채널 : " + channel);
			}
			
		}
		
		
		
		
		/*else {
		
		if ( channel < 1) {
			channel+=5;
			
		} 
		if ( down < 1) {
			
			System.out.println("현재 채널 : " + channel);
			
		} else {
			channel--;
			System.out.println("채널 : " + channel);
			
			channeldown(down-1);
			
		}
			
		
		
		}*/
		
	}
}
