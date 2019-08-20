package com.nucleus.dao;




import java.util.List;

import com.nucleus.model.Customer;

public interface ICustomerDao {
	public void SaveCustomerData(Customer customer);
	public void UpdateCustomerData(Customer customer);
	public void DeleteCustomerData(Customer customer);
	public List DisplayCustomerData();
	public Customer DisplayCustomerDataById(String customerid);

}
