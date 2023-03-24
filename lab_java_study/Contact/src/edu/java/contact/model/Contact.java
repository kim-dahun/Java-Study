package edu.java.contact.model;

// MVC(MODEL-VIEW-Controller) 아키텍쳐에서 Model에 해당하는 클래스.
// 특별한 기능은 없는, 순수하게 데이터만 설계하는 클래스.
// VO(Value Object) : 값(자료) 를 표현하는 객체.
// DTO(Data Transfer Object): 데이터를 전달(메서드 argument, 리턴값) 할 때 사용되는 객체.

public class Contact {
	// field
	private int cid;
	private String name;
	private String phone;
	private String email;

	// constructor

	public Contact() {

	}

	public Contact(int cid, String name, String phone, String email) {

		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	// method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCid() {
		return cid;
	}

	@Override
	public String toString() {

		return String.format("Contact(Cid=%d, Name=%s, Phone=%s, Email=%s)", cid, name, phone, email);
	}

	// return String.format()

}
