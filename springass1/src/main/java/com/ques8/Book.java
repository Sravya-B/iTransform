package com.ques8;

public class Book {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void initIt() throws Exception{
		System.out.println("This is initIt method in xml's message- "+message);
	}
	
	@Override
	public String toString() {
		return message;
	}

	public void cleanUp() throws Exception{
		System.out.println("This is cleanUp method in xml");
	}
	
}
