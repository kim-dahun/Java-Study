package interftest;

import java.util.Random;

public class Card implements BlackjackInf {

	Random rand = new Random();
	int[] cardlist = new int[52];
	int[] check = new int[52];

	public int[] cardlist() {
		return cardlist;
	}
	
	public int[] cardsuffle() {

		int cardNum = 0;
		for (int i = 0; i < cardlist.length; i++) {
			if (i % 13 == 0 && i/13 >= 1) {
				cardNum -= 13;
			}
			cardNum++;
			cardlist[i] = cardNum;
			
		}
		return cardlist;
	}

	public int carddraw() {
		boolean run = true;
		int result = 0;
		
		while (run) {
			int select = rand.nextInt(0, 51);
			if (check[select] == 0) {
				check[select] = cardlist[select];
				run = false;

			} else {
				continue;
			}
			result = check[select];
		}
		return result;
		
	}

	public boolean gamestop() {
		boolean run = (0 > 1);
		return run;
	}

}
