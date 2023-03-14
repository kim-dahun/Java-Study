package sample.work3.reserve;

public class CheckReservation {
	double startTime;
	double revTime;
	String name;
	int roomnum;
	RoomInfo roomInfo;
	
	public CheckReservation(RoomInfo roomInfo) {
		this.startTime = roomInfo.startTime;
		this.revTime = roomInfo.revTime;
		this.name = roomInfo.name;
		this.roomnum = roomInfo.roomnum;
	}
	
	public void checkReserve() {
		int startHour = time(startTime,0);
		int startMin = time(startTime,1);
		int endHour = time(startTime+revTime,0);
		int endMin = time(startTime+revTime,1);
		int revHour = time(revTime,0);
		int revMin = time(revTime,1);
		
		System.out.println(roomnum + " 번 방을 예약하신 " + name + " 님의 예약은 " + startHour +"시 " + startMin + "분부터 " + endHour + "시 " + endMin + "분 까지 입니다.");
		System.out.println("총 예약시간은 " + revHour + "시간 " + revMin + "분 입니다.");
	}
	
	public int time(double time, int i) {
		if(i==0) {
			int result = (int)(time*60)/60;
			
			return result;
		}else {
			int result = (int)(time*60)%60;
			
			return result;
		}
		
		
	}
}
