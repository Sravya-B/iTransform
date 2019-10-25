package com.ques8;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Customer {
String comments;

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}
@PostConstruct
public void customInIt() throws Exception {
	System.out.println("Init method in PostConstruct annotation's comment- "+getComments());
}
@Override
public String toString() {
	return comments;
}


@PreDestroy
public void customCleanUp() throws Exception {
	System.out.println("cleanUp method in PreDestroy annotation");
}
}
