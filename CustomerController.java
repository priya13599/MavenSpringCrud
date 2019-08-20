package com.nucleus.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.dao.ICustomerDao;
import com.nucleus.model.Customer;
@Controller
public class CustomerController {
	
	
	@Autowired
    ICustomerDao iCustomerDao;
	
	
	
	@RequestMapping("/Request")
	public ModelAndView request1(Customer customer)
	{
		return new ModelAndView("CustomerForm");
	}
	
	
	@RequestMapping("/saveCustomer")
	public ModelAndView request2(@Valid Customer customer,BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("CustomerForm");
		}

		iCustomerDao.SaveCustomerData(customer);
		return new ModelAndView("result","cust",customer);
	}
	@RequestMapping("/updateCustomer")
	public ModelAndView request3(Customer customer)
	{
		iCustomerDao.UpdateCustomerData(customer);
		return new ModelAndView("result1","cust",customer);
		
	}
	@RequestMapping("/deleteCustomer")
	public ModelAndView request4(Customer customer)
	{
		iCustomerDao.DeleteCustomerData(customer);
		return new ModelAndView("result2","cust",customer);
	}
	@RequestMapping("/displayCustomer")
	public ModelAndView request5(ModelAndView model)
	{
		List<Customer> customer = iCustomerDao.DisplayCustomerData();
		model.addObject("cust",customer);
		model.setViewName("result3");
		return model;
	}
	
	
	@RequestMapping("/displayCustomerbyId")
	public ModelAndView request6(HttpServletRequest request)
	{ String customerid = request.getParameter("customerid");
		Customer customer = iCustomerDao.DisplayCustomerDataById(customerid);
		ModelAndView model = new ModelAndView();
		model.addObject("cust",customer);
		model.setViewName("result3");
		return model;
	}
	
}
