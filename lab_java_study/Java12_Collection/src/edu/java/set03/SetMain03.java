package edu.java.set03;

import java.util.HashSet;

public class SetMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set<E> 는 중복된 값을 저장하지 않음.

		HashSet<String> set = new HashSet<>();
		set.add("hello");
		set.add("olleh");
		set.add("hello");

		System.out.println(set);

		HashSet<Score> scores = new HashSet<>();

		Score score1 = new Score(100, 100, 100);
		System.out.println(score1);
		scores.add(score1);
		Score score2 = new Score(100, 100, 100);

	
		
		scores.add(score2);
		// ->(1) equals만 override를 하고 hashcode를 override 하지 않으면 score2가 Set에 추가됌.
		// ->(2) equals와 hashcode를 모두 적절하게 override하면 score2는 set에 추가되지 않음.

		// equals() 가 true 이면, hashCode() 리턴값이 같다.
		// hashCode() 리턴값이 다르면, equals()가 false이다.
		// Set은 두 객체의 중복(같은지 다른지) 여부를 검사할 때 hashCode()를 먼저 비교하고,
		// hashCode() 가 같으면 equals() 메서드를 호출해서 중복여부를 검사함.

		System.out.println("score1 score2 eq? " + score1.equals(score2));
		scores.add(new Score(100, 90, 80));
		scores.add(new Score(100, 100, 100));

		System.out.println();

		System.out.println(scores);

	}

}
