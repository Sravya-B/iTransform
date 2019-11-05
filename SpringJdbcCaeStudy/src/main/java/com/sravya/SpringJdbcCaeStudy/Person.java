package com.sravya.SpringJdbcCaeStudy;

public class Person {
@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
String name;
String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
