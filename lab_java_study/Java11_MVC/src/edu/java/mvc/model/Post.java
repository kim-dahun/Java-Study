package edu.java.mvc.model;

import java.time.LocalDateTime;

public class Post {

	// field

	private int pid;
	private String title;
	private String content;
	private String author;
	private LocalDateTime createdTime;
	private LocalDateTime modifiedTime;
	
	// constructor
	
	public Post() {
		
	}
	
	public Post(int pid, String title, String content, String author, LocalDateTime createdTime, LocalDateTime modifiedTime) {
		this.pid = pid;
		this.title = title;
		this.content = content;
		this.author = author;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}
	
	// method
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[ PostId = %d, Title = %s, Author = %s, Content = %s, CreatedTime = %t, ModifiedTime = %t ]", this.pid, this.title, this.author ,this.content , this.createdTime , this.modifiedTime);
	}
	
	public void printEasy() {
		
		System.out.printf("[PostId = %d, Title = %s, Author = %s, ModifiedTime = %t] \n", this.pid , this.title , this.author , this.modifiedTime);
		
	}

}
