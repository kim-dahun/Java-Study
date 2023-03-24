package edu.java.contact03;

import edu.java.contact.model.Contact;

//MVC(Model-View-Controller) 아키텍쳐 컨트롤러 구현 클래스.
// singleton Design pattern 적용.

public class ContactDaoImpl implements ContactDao {

	// singleton step 1
	private static ContactDaoImpl instance = null;
	// singleton step 2

	private ContactDaoImpl() {

	};

	// singleton step 3
	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}

		return instance;

	}

	// fields
	private static final int MAX_LENGTH = 5; // 배열의 크기(길이);
	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처 객체들을 저장할 배열
	private int count = 0; // 배열에 현재까지 저장된 연락처 객체의 갯수.
	// -> 배열에 연락처를 저장할 때 +1 , 배열에서 연락처 객체를 삭제할 때 -1.

	// methods

	/**
	 * 연락처 배열에 새로운 연락처 객체를 저장할 수 있는 지를 리턴하는 메서드.
	 * 
	 * @return 배열의 빈 공간이 있으면 true, 그렇지 않으면 false.
	 */
	public boolean isMemoryAvailable() {
		return count < MAX_LENGTH;
	}

	/**
	 * 어떤 인덱스가 검색, 수정, 삭제할 때 사용 가능한 범위 안에 있는 인덱스인지를 리턴.
	 * 
	 * @param index 유효한 index인지 검사할 인덱스
	 * @return 사용가능한 인덱스는 true, 그렇지 않으면 false.
	 */
	public boolean isValidIndex(int index) {
		return (index >= 0) && (index < count);
	}

	// CRUD(Create, Read, Update, Delete) 기능 메서드들:
	@Override
	public int create(Contact c) {
		if (!isMemoryAvailable()) {
			return 0;
		}
		contacts[count] = c;

		count++;

		return 1;
	}

	@Override
	public Contact[] read() {
		// TODO Auto-generated method stub
		Contact[] array = new Contact[count];
		// -> contacts 배열에 저장된 원소 개수의 크기를 가지는 새로운 배열을 생성.

		for (int i = 0; i < array.length; i++) {
			array[i] = contacts[i];
		}

		return array;
	}

	@Override
	public Contact read(int index) {

		if (isValidIndex(index)) {
			return contacts[index];
		} else {
			return null;
		}

	}

	@Override
	public int update(int index, Contact c) {
		// TODO Auto-generated method stub
		if (isValidIndex(index)) {
			contacts[index] = c;
//			contacts[index].setName(c.getName());
//			contacts[index].setPhone(c.getPhone());
//			contacts[index].setEmail(c.getEmail());
			return 1;
		}

		return 0;
	}

	@Override
	public int delete(int index) {
		// TODO Auto-generated method stub
		if(!isValidIndex(index)) {
			
			return 0;
		}
		for(int i = index; i<count ; i++) {
			if(i==count-1) {
				contacts[i]=null;
			} else {
				contacts[i]=contacts[i+1];
			}
		}
		count--;
		return 1;
	}

}
