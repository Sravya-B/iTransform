package com.ques5;

import org.springframework.beans.factory.annotation.Required;

public class Address {
private String location;

public String getLocation() {
	return location;
}
@Required
public void setLocation(String location) {
	this.location = location;
}

@Override
public String toString() {
	return  location ;
	}

}
