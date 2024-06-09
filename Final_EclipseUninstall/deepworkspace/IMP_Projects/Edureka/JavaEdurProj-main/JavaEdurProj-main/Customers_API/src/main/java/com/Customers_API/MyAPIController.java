package com.Customers_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyAPIController {

	@Autowired
	CustomerRepository repo;

	@RequestMapping("/")
	private String home() {
		return "Home";
	}

	@RequestMapping("/AddCustomer")
	private String AddCustomer() {
		return "AddCustomer";
	}

	@PostMapping("/AddCustomerRecord")
	private String AddCustomerRecord(Customer customer) {
		repo.save(customer);
		return "getCustomerById"; // "Success";
	}

	@RequestMapping("/getCustomerById")
	private String getCustomerById() {
		return "getCustomerById";
	}

	@PostMapping("/viewCustomerRecordId")
	private ModelAndView viewCustomerRecord(int cid) {

		System.out.println("cid is = " + cid);

		ModelAndView mv = new ModelAndView("viewCustomer");
		Customer customer = repo.findById(cid).orElse(null);
		mv.addObject(customer);

		return mv;
	}

	@RequestMapping("/updateCustomer")
	private String updateCustomer() {
		return "UpdateCustomer";
	}

	@PostMapping("/UpdateCustomerRecord")
	private String UpdateCustomerRecord(Customer customer) {
		repo.save(customer);
		return "getCustomerById"; // "Success";
	}

	@RequestMapping("/deleteCustomerById")
	private String deleteCustomerById() {
		return "deleteCustomerById";
	}

	@PostMapping("/deleteCustomerRecordId")
	private String deleteCustomerRecord(int cid) {
		repo.deleteById(cid);
		return "getCustomerById"; // "Success";
	}

}
