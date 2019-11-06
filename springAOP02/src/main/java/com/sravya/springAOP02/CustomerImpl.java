package com.sravya.springAOP02;

public class CustomerImpl implements Customer{

	public void customer() {
		System.out.println("customer() method is executed");
		
	}

	public String customerReturn() {
		System.out.println("customerReturn() method is executed");
		return "Hello";
	}

	public void customerException() throws Exception {
		System.out.println("customerException() method is executed");
		throw new Exception("Generic exception");
	}

	public void customerAround() {
		System.out.println("customerAround() method is executed");
		
	}

}
