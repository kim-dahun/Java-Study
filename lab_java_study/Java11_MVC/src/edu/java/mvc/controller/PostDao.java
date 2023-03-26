package edu.java.mvc.controller;

import edu.java.mvc.model.Post;

public interface PostDao {
	
	int write(String Author, String title, String content);
	
	int modify(int n);
	
	int delete(int n);
	
	void readAll(int n);

	void search(int select);
	
	void searchEasy(int select, int select2);
}
