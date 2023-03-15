package sample.work3.reserve;

public class ArrayTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomInfoClassNew[] a1 = new RoomInfoClassNew[4];
		
		for (int i = 0; i<a1.length; i++) {
			int roomNum = i+1;
			String name = null;
			double startTime = 0.0;
			double endTime = 0.0;
			
			RoomInfoClassNew r1 = new RoomInfoClassNew(roomNum,name,startTime,endTime);
			a1[i] = r1;
		}
		
		System.out.println(a1[1].roomNum);
		
	}

}
