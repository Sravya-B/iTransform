package com.ques7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("itemBean")
public class Item {
	@Value("Book")
	private String name;
	@Value("5")
	private int quantity;
	public String getName() {
		return name;
		
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + "]";
	}
	public int getQunatity() {
		return quantity;
	}

}
