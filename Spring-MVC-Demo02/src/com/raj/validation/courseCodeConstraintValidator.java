package com.raj.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class courseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode)
	{
		coursePrefix=theCourseCode.value();
		
	}
	
	@Override
	public boolean isValid(String theCode,ConstraintValidatorContext theConstraintValidatorContext)
	{System.out.println("theCode:"+theCode);
	System.out.println(theConstraintValidatorContext);
		boolean result;
	if(theCode!=null)
	{
		result=theCode.startsWith(coursePrefix);
		
	}
	else
	{result=true;
	}
	
		return false;
	}
	
	
}
