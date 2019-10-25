package com.ques5;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Company {
private String companyName;

public String getCompanyName() {
	return companyName;
}
@Required
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

@Override
public String toString() {
	return   companyName ;
}
public void designation() {
	System.out.println("Designation of Employee is Software Engineer");
}
}
