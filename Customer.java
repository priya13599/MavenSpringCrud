package com.nucleus.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;



public class Customer {
	@Min(value=100, message="Minimum value for customerid is 100")
    @NotEmpty
	private String customerid;
	@Length(min=3, max=10)
    @NotEmpty
	 private String customername;
	 
	 
	 
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	 
	 
	 
	 

}
