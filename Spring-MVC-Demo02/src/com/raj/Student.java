package com.raj;

import com.raj.validation.CourseCodePrime;

public class Student {
private String firstName;
private String lastName;

@CourseCodePrime
private String courseId;



public String getCourseId() {
	return courseId;
}
public void setCourseId(String course) {
	this.courseId = course;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
