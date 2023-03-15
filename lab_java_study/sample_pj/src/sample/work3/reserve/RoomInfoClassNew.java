package sample.work3.reserve;

public class RoomInfoClassNew {
	int roomNum;
	String name;
	double startTime;
	double endTime;

	RoomInfoClassNew(int roomNum, String name, double startTime, double endTime){
		this.roomNum = roomNum;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRoomNum() {
		return this.roomNum;
	}
	
	public void printInfo() {
		int startHour = (int)(startTime*60)/60;
		int endHour = (int)(endTime*60)/60;
		int startMin = (int)(startTime*60)%60;
		int endMin = (int)(endTime*60)%60;
		int revHour = (int)((endTime-startTime)*60)/60;
		int revMin =(int)((endTime-startTime)*60)%60;
		
		System.out.println(roomNum + " 번 방을 예약하신 " + name + " 님의 예약은 " + startHour +"시 " + startMin + "분부터 " + endHour + "시 " + endMin + "분 까지 입니다.");
		System.out.println("총 예약시간은 " + revHour + "시간 " + revMin + "분 입니다.");
	}
}
