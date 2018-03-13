package com33.helloworld;

public class HelloWorldBean {
	private String string;
	public HelloWorldBean(String string) {
		this.string=string;// 
	}
	
	public String getMessage() {
		return string;
	}

	public void setMessage(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [string=%s]", string);
	}

	
}
