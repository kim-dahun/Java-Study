package interftest;

import java.util.Random;
import java.util.Scanner;

public class DevCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		BlackjackInf black = new Card();
		System.out.println("블랙잭을 시작합니다.");
		boolean run = true;
		while(run) {
			System.out.println("======= 1. 게임 시작 / 2. 게임 종료 =======");
			int select = scan.nextInt();
			boolean gamerun = true;
			if(select==1) {
				
				while(gamerun) {
					System.out.println("카드를 셔플합니다.");
					black.cardsuffle();
					System.out.println("카드를 두 장 뽑습니다.");
					int sum = 0;
					int num = 0;
					num = black.carddraw();
					System.out.println(num);
					sum += num;
					
					num = black.carddraw();
					System.out.println(num);
					sum += num;
					
					System.out.printf("현재 값은 : %d%n",sum);
					if(sum>21) {
						System.out.println("현재 값이 21보다 높아 패배입니다.");
						continue;
					}
					System.out.println();
					System.out.println("1. 카드 더 뽑기 / 2. 딜러와 대조");
					select = scan.nextInt();
					switch(select) {
					case(1):
						num=black.carddraw();
						System.out.println(num);
						sum += num;
						if(sum>21) {
							System.out.println("현재 값이 21보다 높아 패배입니다.");
							gamerun=false;
						}
					case(2):
						int deal = rand.nextInt(14,21);
						if(deal>=sum) {
							System.out.printf("내 카드 합계 : %d%n",sum);
							System.out.printf(" 딜러 점수 : %d 이므로 딜러가 이겼습니다.%n",deal);
							gamerun=false;
						} else if (deal<sum && sum <= 21) {
							System.out.printf("내 카드 합계 : %d%n",sum);
							if(sum==21) {
								
								System.out.println("블랙잭");
								gamerun=false;
								break;
							}
							System.out.printf(" 딜러 점수 : %d 이므로 딜러가 이겼습니다.%n",deal);
							
						} else if (sum>21) {
							System.out.printf("내 카드 합계 : %d%n",sum);
							System.out.println("총 숫자가 21을 초과하여 파산");
							gamerun=false;
						}
					}
					
				}
				
			} else if ( select ==2) {
				run = black.gamestop();
			} else {
				run = black.gamestop();
			}
			
			
			
		}
		
		
		
	}

}
