package com.sravya.springAOP01;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternetAccess implements InternetAccess {
RealInternetAccess realInternet=new RealInternetAccess();
List<String> bannedSites=new ArrayList<String>();
{
bannedSites.add("java.com");
bannedSites.add("spring.com");
bannedSites.add("aop.com");
}
	public void internetAccessTo(String serverHost) {
		if(bannedSites.contains(serverHost))
		{
		System.out.println("access denied to "+serverHost);
		}
		else {
			realInternet.internetAccessTo(serverHost);
		}
		
	}

}
