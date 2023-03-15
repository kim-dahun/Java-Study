package edu.java.modifier05;

import edu.java.modifier04.PublicClass;
//import edu.java.modifier04.PackageClass; //-> not visible

// 클래스 접근 수식어(access Modifier)
// 1. public : 어디서나 사용할 수 있는 클래스.
// 2. (package) : 수식어가 없는 경우. => default; 같은 패키지의 클래스들에서만 사용 가능한 클래스
// (주의) public 클래스의 이름은 java 파일의 이름과 같아야 함!
// 1개의 Java 파일에 2개의 public class를 정의할 수 없다.

// public class A {} // -> 문법 오류
class B {} // -> public이 아니므로, 같은 자바 파일 내에 선언 가능;
// 가능은 하지만 웬만해서는 class는 파일별로 분리하는 게 좀 더 좋은 코딩 습관

public class ModifierMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// edu.java.modifier04.PublicClass 타입의 객체를 생성
		
		PublicClass cls = new PublicClass();
		
//		edu.java.modifier04.PackageClass() cls2 = new edu ... PackageClass(); // -> not visible
	}

}
