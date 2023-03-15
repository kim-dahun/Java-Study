package edu.java.modifier03;

public class Test { // class 는 public 혹은 (package) 만 접근제한 수식어로 사용 가능
	// field
	private int number;
	private String name;
	private double pressure;
	private boolean married;

	// constructor - 마우스 오른쪽 클릭 -> Source -> Generate constructor using fields.
	public Test(int number, String name, double pressure, boolean married) {
		
		this.number = number;
		this.name = name;
		this.pressure = pressure;
		this.married = married;
		
	}

	public Test() {
		
	}

	public Test(int number, String name, double pressure) {
		this.number = number;
		this.name = name;
		this.pressure = pressure;
	}

	
	// 오른쪽 클릭 -> Source -> Generate getters and setters...
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	
	
	// method
	
}
