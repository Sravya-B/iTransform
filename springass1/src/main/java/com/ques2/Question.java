package com.ques2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
String questionId;
String question;
String ans;
public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}
List<Object> answers1;
Set<Object> answers2;
Map<Object,Object> answers3;
public String getQuestionId() {
	return questionId;
}
public void setQuestionId(String questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
@Override
public String toString() {
	return "[question=" + question + ", ans=" + ans + "]";
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Object> getAnswers1() {
	return answers1;
}
public void setAnswers1(List<Object> answers1) {
	this.answers1 = answers1;
}
public Set<Object> getAnswers2() {
	return answers2;
}
public void setAnswers2(Set<Object> answers2) {
	this.answers2 = answers2;
}
public Map<Object, Object> getAnswers3() {
	return answers3;
}
public void setAnswers3(Map<Object, Object> answers3) {
	this.answers3 = answers3;
}

}
