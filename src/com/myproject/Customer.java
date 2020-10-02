package com.myproject;

import javax.validation.constraints.Size;

import com.custom.annotation.NamePrefixer;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import com.sun.istack.internal.NotNull;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Customer {

	private String firstName;
		
	@NotNull(message="This is required")
	@Size(min=1, message="This is required")
	private String lastName;
	
	@NotNull(message ="This is required")
	@Min(value =0, message ="Must be greater than or equal to zero")
	@Max(value =10, message ="must be less than or equal to 10")
	private Integer freePasses;

	@Pattern(regexp="^[0-9]{5}", message ="only 5 digits" )
	private String postalCode;
	
	@NamePrefixer(value={"Se","Na"}, message= "must begin with 'Se' or 'Na'")
	private String lugandaName;
	
	
	

	public String getLugandaName() {
		return lugandaName;
	}

	public void setLugandaName(String lugandaName) {
		this.lugandaName = lugandaName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
	
	
}
