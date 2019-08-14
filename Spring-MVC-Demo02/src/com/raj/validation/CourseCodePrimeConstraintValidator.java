package com.raj.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CourseCodePrimeConstraintValidator 
implements ConstraintValidator<CourseCodePrime, String>{

//	private String coursePrefix;
	public boolean isPrime(String code) {
		int number=Integer.parseInt(code);
		int flag=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) flag=1;
		}
		if(flag==0)
			return true;
		return false;
	}
	@Override
	public void initialize(CourseCodePrime theCourseCodePrime) {
//		coursePrefix=theCourseCodePrime.value();
//		public boolean isPrime()
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext)
	{
		boolean result;
		if(theCode!=null) {
			result=isPrime(theCode);
		}
		else
		{
			result=true;
		}
		return result;
	}
	
//	@Override
//	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
