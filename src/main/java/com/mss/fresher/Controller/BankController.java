package com.mss.fresher.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.fresher.Entity.Customer;
import com.mss.fresher.Repo.CustomerRepo;

@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("/verify")
	public Customer  verify(@RequestBody Customer customer) {
		
	
		
		customerRepo.save(customer);
		return customer;
	}

	
	@GetMapping("/get/{id}")
	public Customer getCustomer(@PathVariable String  id) {
		
		System.out.println(id);
		Customer customer = customerRepo.findById(id).get();
		
		return customer;
	}
}
