package com.ques7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {
@Value("#{itemBean}")
private Item item;
@Value("#{itemBean.name}")
private String itemName;
public Item getItem() {
	return item;
	
}
public String getItemName() {
	return itemName;
}
@Override
public String toString() {
	return "Customer [item=" + item + ", itemName=" + itemName + "]";
}
}
