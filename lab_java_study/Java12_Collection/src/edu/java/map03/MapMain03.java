package edu.java.map03;

import java.util.HashMap;
import java.util.Set;

public class MapMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단어 개수 세기(word counting):
		// 문자열에 등장하는 단어를 key로 하고, 그 단어의 등자 횟수를 value로 하는 Map을 만들고 출력하세요.
		// 결과> {하늘=3, 땅=2, sky=2}
		String sentence = "하늘 땅 하늘 땅 하늘 sky sky";

		HashMap<String, Integer> wordcount = new HashMap<>();

		int count = 0;
		int count2 = 0;
		int count3 = 0;

		String[] strArray = sentence.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals("하늘")) {
				count++;
				wordcount.put("하늘", count);
			} else if (strArray[i].equals("sky")) {
				count2++;
				wordcount.put("sky", count2);
			} else if (strArray[i].equals("땅")) {
				count3++;
				wordcount.put("땅", count3);
			}
		}

		System.out.println(wordcount);

		/////// 1번
		HashMap<String, Integer> wordcount2 = new HashMap<>();

		String[] strArra2 = sentence.split(" ");

		for (String x : strArra2) {
			if (wordcount2.get(x) == null) {
				wordcount2.put(x, 1);

			} else {
				wordcount2.put(x, wordcount2.get(x) + 1);
			}
			System.out.println(wordcount2);
		}

		System.out.println(wordcount2);

		//////// 2번
		HashMap<String, Integer> wordcount3 = new HashMap<>();

		for (String x : strArra2) {
			Integer countx = wordcount3.getOrDefault(x, 0);
			wordcount3.put(x, countx + 1);

		}
		System.out.println(wordcount3);
	}

}
