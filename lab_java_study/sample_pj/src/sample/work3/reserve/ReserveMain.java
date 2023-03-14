package sample.work3.reserve;

import java.util.Scanner;

public class ReserveMain {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		// 몇 번방 예약할 건지?
		// 예약되어 있는지 확인?
		// 정보 불러오려면 대조 필요.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("예약자명>>>");
		String name = scan.next();
		System.out.println("대관 시작 시간>>>");
		double startTime = scan.nextDouble();
		System.out.println("대관 총 시간>>>");
		double revTime = scan.nextDouble();
		System.out.println("대여 원하는 방번호>>>");
		int roomnum = scan.nextInt();
		System.out.println("계약 진행 여부>>>");
		boolean agreement = scan.nextBoolean();
		
		
		RoomInfo infocheck = new RoomInfo(name,startTime,revTime,roomnum,agreement);
		CheckReservation checkroom = new CheckReservation(infocheck);
		
		checkroom.checkReserve();
		

		
	}

}
