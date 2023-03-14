package subproject;

public class Room {
	// 방 정보를 받는 클래스
	// 받은 정보를 인스턴스에 저장하고, 저장한 Field와 새로 작성하려는 필드를 비교하는 기능
	// 방 예약하기 기능
	// 방 예약을 취소하는 기능
	
	//Field
	
	int startRev; // 예약 시작 시간
	int endRev; // 예약 종료 시간
	String name; // 예약자명 호출
	
	//Constructor
	public Room(int startRev, int endRev, String name ) {
		
		this.name = name;
		this.startRev = startRev;
		this.endRev = endRev;
	}
	
	public Room() {}
	
	//Method
	public boolean checkroom() { // instance.checkroom(); -> 현재 인스턴스(방) 이 예약자가 있는지 없는 지 확인;
		boolean result = false;
		
		if(this.name == null) {
			
		}else {
			result = true;
		}
		return result;
	}
	
	public void cancelroom() { // 방 예약 정보를 삭제해서 빈 방으로 만들기
		
		this.name = null;
		this.startRev = 0;
		this.endRev = 0;
	}
	
	public void printroominfo() {
		System.out.println("예약자명 : " + this.name);
		System.out.println("사용 시작시간 : " + this.startRev + "시");
		System.out.println("사용 종료시간 : " + this.endRev + "시");
	}
	
}
