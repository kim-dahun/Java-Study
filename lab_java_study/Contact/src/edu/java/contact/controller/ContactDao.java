package edu.java.contact.controller;

import java.util.List;

import edu.java.contact.model.Contact;

// MVC 아키텍쳐에서 Controller 역할의 인터페이스
// CRUD( CREATE-INSERT , READ-SELECT , UPDATE-UPDATE, DELETE) 작업을 DB에서.
public interface ContactDao {

	
	/**
	 * 연락처 전체 검색.
	 * 
	 * DB Contact 테이블에 저장된 연락처 정보를 검색
	 * 
	 * @return List<Contact> 
	 */
	List<Contact> read();
	
	
	/**
	 * DB contact 테이블에서 primary key로 연락처 정보를 검색하는 기능
	 * @param cid 검색한 primary key
	 * @return cid가 존해하면 Contact 객체 리턴하고, 아니면 Null리턴
	 */
	Contact read(Integer cid);
	
	/**
	 * 연락처 정보를 DB의 CONTACT 테이블에 INSERT.
	 * @param contact ( 저장할 이름, 이메일, 전화번호 정보를 가지고 있는 객체. 
	 * @return DB에 저장된 행의 갯수
	 */
	int create(Contact contact);
	
	
	/**
	 * primary key의 연락처 정보를 수정(업데이트)
	 * 
	 * @param Contact 수정할 연락처의 PK(Cid), 수정할 이름, 전화번호, 이메일정보를 저장한 객체
	 * @return DB테이블에서 업데이트된 행의 개수
	 */
	int update(Contact contact);
	
	/**
	 * Primary key(cid) 에 해당하는 연락처 정보를 DB 테이블에서 삭제.
	 * 
	 * @param cid 삭제할 연락처의 PK
	 * @return Integer
	 */
	int delete(Integer cid);
	
	
	/**
	 * 주어진 검색어가 이름 또는 전화번호 또는 이메일에 포함된 연락처들을
	 * DB contacts 테이블에서 검색해서 연락처 리스트를 리턴. 검색어는 대소문자 구분 X
	 * @param keyword
	 * @return 검색결과 리스트
	 */
	List<Contact> read(String keyword);
	
	
	
}
