package com.sravya.springAOP01;

public class RealInternetAccess implements InternetAccess{

	public void internetAccessTo(String serverHost) {
		System.out.println("Internet access granted to "+serverHost);
		
	}

}
