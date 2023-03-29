package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FileMain07 {

	Random rand = new Random();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileMain07 app = new FileMain07();
//		System.out.println(stu);
		
		// 1. 학생 타입 ArrayList 객체 생성
		ArrayList<Student> stuList = new ArrayList<>();
		// 2. 1,000,000개의 Student 객체를 리스트에 저장.
		for(int i = 0 ; i<1_000_000 ; i++) {
			Score sco = new Score(app.randomNum(),app.randomNum(),app.randomNum());
			Student stu = new Student(i+1,app.nameMaker(),sco);
			
			stuList.add(stu);
			
		}
		
		
		// 3. 리스트를 students.dat 파일에 쓰기.
		String file = "data/students.dat";
		
		try(FileOutputStream out = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);){
			
			long start = System.currentTimeMillis();
			oout.writeObject(stuList);
			long end = System.currentTimeMillis();
			
			System.out.println("작업 완료");
			System.out.println("WRITE 소요 시간 : " + (end-start) + "ms");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 4. 파일에서 데이터를 읽어서 역직렬화 -> 읽은 데이터 확인.
		
		FileInputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		try{
			
			in = new FileInputStream(file);
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			long start = System.currentTimeMillis();
			
			
			ArrayList<Student> stuListBackup = (ArrayList) oin.readObject();
			
			long end = System.currentTimeMillis();
			System.out.println("작업 완료");
			System.out.println("READ 소요 시간 : " + (end-start) + "ms");
			
			start = System.currentTimeMillis();
			System.out.println("샘플 검증을 시작합니다.");
			for ( int i = 0 ; i<1_000_000 ; i++) {
				
				if(i<100) {
					System.out.println(stuList.get(i) + " /// " + stuListBackup.get(i));
				}
	
				if(!stuList.get(i).equals(stuListBackup.get(i))) {
					System.out.println("파일의 내용이 다릅니다.");
					break;
				}
			}
			end = System.currentTimeMillis();
			System.out.println("작업 완료");
			System.out.println("검증 소요 시간 : " + (end-start) + "ms");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public int randomNum() {
		int result = 0;
		
		result = rand.nextInt(0,101);
		
		
		return result;
	}

	public String nameMaker() {
		String firstName = "김감강구고남나도라박방서성석이안오장정주조지전천하한황";
		 List<String> lastName = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
			        "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
			        "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
			        "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
			        "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준",
			        "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형",
			        "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비",
			        "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼",
			        "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠",
			        "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
		
		Random rand = new Random();
		int selectFist = rand.nextInt(0,firstName.length());
		int selectLast1 = rand.nextInt(0,lastName.size());
		int selectLast2 = rand.nextInt(0,lastName.size());
		
		String result = ""+firstName.charAt(selectFist)+lastName.get(selectLast1)+lastName.get(selectLast2);
		
		
		return result;
	}
	
}
