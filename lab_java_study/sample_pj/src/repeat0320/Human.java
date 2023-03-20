package repeat0320;

// 현재 구역을 나타낼 플랫폼 클래스 를 상속하는 HUMAN 클래스

public class Human extends Location {
	// field
	private String name;
	private int age;

	// constructor
	public Human() {

	}

	public Human(String name, int age, String location, int detailsX, int detailsY) {
		super(location, detailsX, detailsY);
		this.name = name;
		this.age = age;

	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override

	public void printNowInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 위치 : %s, 상세위치 : %s%n", name, age, super.getLocation(),
				super.viewNowdetail());
	}

	@Override // 위치와 상세위치의 X 값이 같다면 True
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Human) {
			Human otherMan = (Human) obj;
			return (this.getLocation().equals(otherMan.getLocation())) && (this.getDetailsX() == otherMan.getDetailsX());

		}

		return false;
	}
	
	
	@Override
	public int hashCode() {// hashcode - 문자열을 Char 배열로 변환 후 해당 값을 int로 캐스팅하고, 짝수번째 값은 더하고, 홀수번째값은 뺀 후 마지막에 첫째 자리 값 더함. 
		// TODO Auto-generated method stub
		int result = 0;
		
		char[] chr;
		chr = this.getLocation().toCharArray();
		
		for(int i = 0 ; i<chr.length; i++) {
			int number = (int) chr[i];
			
				result += number;
			
				
			
		}
		
		result+=chr[0];
		result*=this.getDetailsX();
		
		return result;
	}
	
}
