package edu.java.class02;

public class ClassMain02 {

	public static void main(String[] args) {
		
		// TV 객체 사용 - TV 켬/끔, 채녈 번경, 볼륨 변경, ...
		
		
		
		// (1) TV 객체를 생성
		BasicTv tv1 = new BasicTv();
		
		// tv1.powerOn : 생성된 객체(인스턴스) Tv1의 필드 powerOn.
		// (2) 생성된 TV 객체(인스턴스)의 필드 또는 메서드를 사용
		System.out.println(tv1.powerOn);
		System.out.println(tv1.volume);
		System.out.println(tv1.channel);
		
		tv1.onOff(); // 객체가 가진 메서드를 호출.
		tv1.volumeUp(9); // 인수는 버튼 누른 횟수.
		tv1.volumeDown(3);
		tv1.volumeDown(4);
		tv1.channelup(20); 
		tv1.channeldown(7);
		tv1.onOff();
		tv1.onOff();
		System.out.println("현재 채널 : " + tv1.channel); // BasicTv 에 저장된 필드 channel 변수 값 출력
		System.out.println("현재 소리크기 : " + tv1.volume); // BasicTv 에 저장된 필드 volume 변수 값 출력
		tv1.channel=0;
		
		/*tv1.channelup2(110);
		System.out.println(tv1.channel);*/ 
		//리턴값 없이 선언해도 channelup2 메서드에서 channel 필드로 넘어간 값은 남아있기 때문에
		//channelup2 메서드를 void로 선언해도 channel 값을 계속 유지할 수 있음.
		
	}

}
