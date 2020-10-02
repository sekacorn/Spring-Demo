package com.custom.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NamePrefixerConstraintValidator implements ConstraintValidator<NamePrefixer, String>{
	private String[] NamePrefixer_Prefix;
	
	@Override
	public void initialize(NamePrefixer theNamePrefixer) {
		NamePrefixer_Prefix = theNamePrefixer.value();
		
		
		
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result=false;
		
		if(theCode!=null) {
			
			for (String tempPrefix : NamePrefixer_Prefix) {
                result = theCode.startsWith(tempPrefix);
                
                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
            }
		}
		
		else
		{
			result =true;
		}
		return result;
		
	}
}

