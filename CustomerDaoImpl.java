package com.nucleus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao{

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void SaveCustomerData(Customer customer) {
		
		Object[] object = {customer.getCustomerid(),customer.getCustomername()};
		jdbcTemplate.update("insert into customertablepr values(?,?)",object);	
		
	}
	@Override
	public void UpdateCustomerData(Customer customer) {
		Object[] object = {customer.getCustomerid()};
		jdbcTemplate.update("update customertablepr set customername='Shivika' where customerid=?",object);
		
	}
	@Override
	public void DeleteCustomerData(Customer customer) {
		Object[] object ={customer.getCustomerid()};
		jdbcTemplate.update("delete from customertablepr where customerid=?",object);
		
	}
	@Override
	public List DisplayCustomerData() {
		List<Customer> customer = jdbcTemplate.query("select * from customertablepr",new RowMapper<Customer>()
				{

					@Override
					public Customer mapRow(ResultSet rs, int rownum) throws SQLException {
						Customer cust = new Customer();
						cust.setCustomerid(rs.getString("customerid"));
						cust.setCustomername(rs.getString("customername"));
						return cust;
					}
			
				});
		return  customer;
		
	}
	@Override
	public Customer DisplayCustomerDataById(String customerid) {
		Customer customer = jdbcTemplate.query("select * from customertablepr where customerid="+customerid+"", new ResultSetExtractor<Customer>()
				{

					@Override
					public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
						if(rs.next())
						{
							Customer cust = new Customer();
							cust.setCustomerid(rs.getString("customerid"));
							cust.setCustomername(rs.getString("customername"));
							return cust;
						}
						return null;
						
					}
			
				});
		return customer;
	}
	

}
