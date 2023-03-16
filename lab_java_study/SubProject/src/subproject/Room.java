package subproject;

public class Room {
	// 방 정보를 받는 클래스
	// 받은 정보를 인스턴스에 저장하고, 저장한 Field와 새로 작성하려는 필드를 비교하는 기능
	// 방 예약하기 기능
	// 방 예약을 취소하는 기능
	
	//Field
	int roomNum;
	double startTime; // 예약 시작 시간
	double endTime; // 예약 종료 시간
	String name; // 예약자명 호출
	String id;
	
	//Constructor
	public Room(int roomNum, String name, double startRev, double endRev) {
		this.roomNum = roomNum;
		this.name = name;
		this.startTime = startRev;
		this.endTime = endRev;
		
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
		System.out.println(this.roomNum + "번 방이 취소되었습니다.");
		this.name = null;
		this.startTime = 0;
		this.endTime = 0;
		this.id = null;
	}
	
	public void printroominfo() {
		System.out.println("============" + this.roomNum + " 번 방===========");
		
		int startHour = (int)(startTime*60)/60;
		int endHour = (int)(endTime*60)/60;
		int startMin = (int)(startTime*60)%60;
		int endMin = (int)(endTime*60)%60;
		int revHour = (int)((endTime-startTime)*60)/60;
		int revMin =(int)((endTime-startTime)*60)%60;
		
		System.out.println("예약자명 : " + this.name + "아이디 : " + this.id);
		System.out.println("사용 시작시간 : " + startHour + "시 " + startMin +"분");
		System.out.println("사용 종료시간 : " + endHour + "시 " + endMin + "분");
		System.out.println(name + " 님의 예약은 " + startHour + "시 " + startMin +"분" + "부터 " + endHour + "시 " + endMin + "분 까지 입니다.");
		System.out.println("총 예약시간은 " + revHour + "시간 " + revMin + "분 입니다.");
		System.out.println("=============================");
	}
	
}
