package edu.java.set01;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Collection<E>
 * |__List<E>
 * 	  |__ArrayList<E>, LinkedList<E>, ...
 * 
 * Collection <E>
 * |__ Set<E>
 * 	  |__HashSet<E>, TreeSet<E>, ...
 * 
 * Set 의 특징
 * 1. 중복된 값을 저장하지 않음. (예) {1,2} = {1,2,1,2}
 * 2. 저장할 순서가 중요하지 않음. 인덱스가 없음. (예) {1,2} = [2,1}
 * 
 * HashSet : Hash 알고리즘( 검색을 빠르게 할 수 있는 알고리즘) 을 사용한 Set.
 * Treeset : Tree 알고리즘(정렬을 빠르게 할 수 있는 알고리즘) 을 사용한 set 왼쪽-> 오른쪽
 */


public class SetMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set = new TreeSet<>();
		
		System.out.println(set.size());
		System.out.println(set);
		
		set.add("hello");
		set.add("apple"); // TreeSet은 정렬된 형태
		set.add("hello"); // 중복된 값은 저장되지 않음.
		set.add("zip");
		set.add("banana");
		System.out.println(set); // Set은 toString을 override.
		
		// Set은 인덱스를 갖지 않기 때문에 get(int index) 메서드는 제공되지 않음.
		// for 문장을 사용할 수 없다. for-each 문장과 Iterator는 사용 가능.
		for(String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		Iterator<String> itr = set.iterator(); // 오름차순 반복 도구
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		Iterator<String> itr2 = set.descendingIterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		
		System.out.println();
		
	}

}
