package com.SubmissionForm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@Autowired
	CustomerRepository repo;

	@RequestMapping("/")
	private String createCustomer() {
		return "AddCustomers";
	}

	@RequestMapping("/getCustomer")
	private String getCustomer() {
		return "ViewCustomer";
	}

	@PostMapping("/AddCustomerInDB")
	private String CustDeatails_2(Customers customers) {

		repo.save(customers);
		return "ViewCustomerById";
	}

	@PostMapping("/getCustomerById")
	private ModelAndView getCustomerDetails(@RequestParam("cid") int cid) {

		ModelAndView mv = new ModelAndView("RetriveCustomer");

		Customers customers = repo.findById(cid).orElse(null);
		mv.addObject(customers);
		System.out.println("Cid is == " + cid);
		return mv;
	}

	@RequestMapping("/customers_arr")
	@ResponseBody
	private String getCustomers() {

		return repo.findAll().toString();
	}

	@RequestMapping("/customer_arr/{cid}")
	@ResponseBody
	private String getCustomerAPI(@PathVariable("cid") int cid) {

		return repo.findById(cid).toString();
	}

	@GetMapping("/customers")
	@ResponseBody
	private List<Customers> getCustomerAPI_Json() {

		return repo.findAll();
	}

	@GetMapping("/customers/{cid}")
	@ResponseBody
	private Optional<Customers> getCustomerAPI_Json(@PathVariable("cid") int cid) {

		return repo.findById(cid);
	}

	@PostMapping("/customer")
	@ResponseBody
	private List<Customers> postCustomerAPI_Json(@RequestBody Customers customer) {

		repo.save(customer);

		return repo.findAll();
	}

	@PutMapping(path = "/customer", consumes = { "application/json" })
	@ResponseBody
	private List<Customers> updateCustomerAPI_Json(@RequestBody Customers customer) {

		repo.save(customer);

		return repo.findAll();
	}

	@DeleteMapping("/customer/{cid}")
	@ResponseBody
	private List<Customers> deleteCustomer(@PathVariable("cid") int cid) {
		System.out.println("Trying to delete = " + cid);

		Customers customers = repo.getReferenceById(cid);
		repo.delete(customers);

		return repo.findAll();
	}

//	@PostMapping("/AddCustomerInDB")
//	private String CustDeatails(@RequestParam("cid") String cid, @RequestParam("cname") String cname, 
//			@RequestParam("cemail") String email, ModelMap modelMap) {
//			
//		modelMap.addAttribute("cId", cid);
//		modelMap.addAttribute("cName", cname);
//		modelMap.addAttribute("cEmail", email);
//		
//		return "ViewCustomer";
//	}

}
