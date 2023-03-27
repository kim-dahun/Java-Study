package edu.java.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain03 {

	public static void main(String[] args) {
		// 문자열들을 원소로 갖는 List 생성과 동시에 초기화.
		// Arrays.asList(...); - Argument로 전달된 값들을 원소로 갖는 리스트 객체를 생성.
		List<String> subjects = Arrays.asList("Java","SQL","HTML",
				"CSS","JavaScript","Servlet","JSP","Spring","Python");
		
		System.out.println(subjects);
		
		// 리스트 Subject에서 5글자 이상인 문자열들만 저장하는 리스트를 만들고 출력.
		
		List<String> longwords = new ArrayList<>(); // List는 인터페이스로 생성자를 부를 순 없지만, 다형성으로 객체 생성해서 저장은 가능.
		
//		for(int i = 0; i<subjects.size() ; i++) {
//			if(subjects.get(i).length()>=5) {
//				longwords.add(subjects.get(i));
//			}
//		}
		
		Iterator<String> irt = subjects.iterator();
		while(irt.hasNext()) {
			String s = irt.next();
			if(s.length()>=5) {
				longwords.add(s);
			}
		}
		System.out.println();
		System.out.println(longwords);
		
		// 리스트 Subjects의 원소들의 글자 수를 저장하는 리스트를 만들고 출력.
		
		LinkedList<Integer> lengthofSubjects = new LinkedList<>();
		
		for(int i = 0 ; i<subjects.size(); i++) {
			lengthofSubjects.add(subjects.get(i).length());
		}
		System.out.println(lengthofSubjects);
		
		// 정수(0,1) 을 저장하는 리스트를 생성.
		List<Integer> codes = Arrays.asList(0,1,0,0,1,1);
		List<String> result = new ArrayList<>(); // 비어있는 리스트 생성.
		// List Codes의 원소가 0일때는 "Male", 1이면 "Female" 을 원소로 갖는 리스트를 만들고 출력.
//		for(int i = 0 ; i<codes.size() ; i++) {
//			
//			if(codes.get(i)==0) {
//				result.add("Male");
//				continue;
//			}
//			result.add("Female");
//		}
		
//		Iterator<Integer> itr = codes.iterator();
//		
//		while(itr.hasNext()) {
//			
//			if(itr.next()==0) {
//				result.add("male");
//			} else {
//				result.add("Female");
//			}
//		}
		
		for(Integer c : codes) {
			result.add((c==0) ? "Male" : "Female");
		}
		
		
		System.out.println(result);
		// int n 을 받아서 n의 자릿수합계 구하기
		int answer=0;
		int n = 123479959;
		String s1 = ""+n;
		String[] s2 = new String[s1.length()];
		for(int i = 0 ; i<s2.length ; i++) {
			s2[i]=s1.charAt(i)+"";
			answer=answer+Integer.parseInt(s2[i]);
			
		}
		System.out.println(answer);
	}

}
