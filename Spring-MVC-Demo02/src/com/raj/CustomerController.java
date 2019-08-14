package com.raj;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/customer")
public class CustomerController {
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping(path="/customerForm")
	public String showCustomerForm(Model model)
	{	Customer customer= new Customer();
	customer.setName("Don");
	model.addAttribute("customer",customer);
		return "customer/customerForm";
	}
//	@RequestMapping(path="/processForm"	)
//	public String processForm(@ModelAttribute(name="customer") Customer customer)
//	{	customer.setName(customer.getName().toUpperCase());
//		return("customer/customerDetails");
//	}
	@RequestMapping(path="/processForm"	)
	public String processForm(@Valid @ModelAttribute(name="customer") Customer customer,BindingResult bindingResult)
	{	
		if(bindingResult.hasErrors())
		{
			return "customer/customerForm";
		}
		customer.setName(customer.getName().toUpperCase());
		return("customer/customerDetails");
	}
	
}
