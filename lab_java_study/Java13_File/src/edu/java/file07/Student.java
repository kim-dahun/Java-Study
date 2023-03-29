package edu.java.file07;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Student implements Serializable  {

	private int id;
	private String name;
	private Score score;
	
	
	public Student(int id, String name, Score score) {
		
		this.id = id;
		this.name = name;
		this.score = score;
	}


	public Student() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Score getScore() {
		return score;
	}


	public void setScore(Score score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("StudentInfo [ id : %d, Name : %s, Score( %s ) ]", this.id,this.name,this.score.toString());
	}
	// TODO : 생성자, getter&setter, toString
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id+score.getJava()+score.getPython()+score.getWeb();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		if(obj instanceof Student) {
			Student other = (Student) obj;
			if(this.getId()==other.getId() || this.getName()==other.getName() 
					|| this.getScore().getJava()==other.getScore().getJava() || this.getScore().getPython()==other.getScore().getPython() 
					|| this.getScore().getWeb()==other.getScore().getWeb()) {
				
				result= true;
				
			}
		}
		
		return result;
	}
	
}
