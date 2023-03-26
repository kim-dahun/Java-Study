package edu.java.mvc.model;

import java.time.LocalDateTime;

public class Post {

	// field

	private int pid;
	private int postNum;
	private String title;
	private String content;
	private String author;
	private LocalDateTime createdTime;
	private LocalDateTime modifiedTime;
	
	// constructor
	
	public Post() {
		
	}
	
	public Post(int pid, String title, String content, String author, int postNum) {
		this.pid = pid;
		this.title = title;
		this.content = content;
		this.author = author;
		this.postNum = postNum;
		
	}
	
	// method	
	
	
	
	
	public String getTitle() {
		return title;
	}

	public int getPostNum() {
		return postNum;
	}

	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public int getPid() {
		return pid;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[ PostId = %d, Title = %s, Author = %s ]\n<Content>\n%s \n\n[CreatedTime = %tF %tT, ModifiedTime = %tF %tT]\n\n", this.postNum, this.title, this.author ,this.content , this.createdTime , this.createdTime,this.modifiedTime, this.modifiedTime);
	}

	public void printEasy() {
		
		System.out.printf("[PostId = %d, Title = %s, Author = %s, CreatedTime = %tF %tT, ModifiedTime = %tF %tT] \n", this.postNum , this.title , this.author ,this.createdTime,this.createdTime, this.modifiedTime, modifiedTime);
		
	}

}
