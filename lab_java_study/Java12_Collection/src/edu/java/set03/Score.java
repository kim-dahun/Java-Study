package edu.java.set03;

import java.util.Objects;

public class Score {

	private int java;
	private int sql;
	private int web;

	public Score(int java, int sql, int web) {

		this.java = java;
		this.sql = sql;
		this.web = web;

	}
	
	
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s1 = "Abcg";
		
		
		return String.format("점수 : (Java : %d , SQL : %d , WEB : %d)",this.java, this.sql , this.web);
	
	
		
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.java,this.sql,this.web);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		
		if(obj instanceof Score) {
			Score other = (Score) obj;
			result = (this.java == other.java) && (this.sql==other.sql)  && (this.web==other.web) ;
			
		}
		
		return result;
	}
	
}
