package edu.java.inheritance01;


// SMART TV IS TV. SMART TV EXTENDS BASIC TV.
// 스마트TV는 TV이다. 스마트 TV는 기본 TV를 확장한다.
public class SmartTv extends BasicTv{

	private String ip;
	
	public String getIp() {
		
		return this.ip;
	}
	/**
	 * this is setting String ip
	 * 
	 * @param String ip
	 */
	public void setIp(String ip) {
		
		this.ip = ip;
	}
}
