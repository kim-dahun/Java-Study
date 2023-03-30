package edu.java.contact05;

import java.util.List;

import edu.java.contact.model.Contact;

// MVC(Model-View-Controller) 아키텍쳐에서 Controller 역할을 수행할 인터페이스.
// DAO(Data Access Object) : 데이터를 사용해서 비즈니스 로직(기능)을 수행하는 객체.

public interface ContactDao {

	/**
	 * 새 연락처 저장 기능. 연락처 객체를 리스트에 저장.
	 * @param c 리스트에 저장할 연락처 객체
	 * @return 리스트에 저장 성공하면 1, 실패하면 0을 리턴.
	 */
	int create(Contact c) ;
	
	/**
	 * 연락처 전체 목록 보기 기능. 저장된 연락처 개수 크기의 연락처 리스트를 리턴.
	 * @return 연락처 리스트(List<Contact>).
	 */
	List<Contact> read() ;
	
	/**
	 * 인덱스로 검색하기. 전달받은 인덱스 위치에 있는 연락처 객체 리턴.
	 * @param index 검색할 인덱스. 0 이상의 정수.
	 * @return 해당 인덱스의 연락처 (Contact) 객체 또는 Null;
	 */
	
	Contact read(int index);
	
	/**
	 * 인덱스 수정 기능.
	 * @param index 수정할 연락처의 인덱스. 0 이상이고, 저장된 연락처 개수보다 작은 정수.
	 * @param Contact 수정할 연락처 정보를 가진 객체.
	 * @return 수정 성공하면 1, 실패하면 0 리턴.
	 */
	
	int update(int index, Contact c);
	

	
	/**
	 * 연락처 삭제 기능
	 * @param index 삭제할 연락처의 인덱스. 0 이상이고, 저장된 연락처 개수보다 작은 정수.
	 * @return 삭제 성공하면 1, 실패하면 0 리턴.
	 */
	int delete(int index);
	
	
}
