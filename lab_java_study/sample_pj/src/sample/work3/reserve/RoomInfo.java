package sample.work3.reserve;

public class RoomInfo {
	String name;
	double startTime;
	double revTime;
	int roomnum;
	boolean reserve;
	
	
	public RoomInfo(String name, double startTime, double revTime, int roomnum, boolean reserve) {
		this.name = name;
		this.startTime = startTime;
		this.revTime = revTime;
		this.roomnum = roomnum;
		this.reserve = reserve;
	}
}
