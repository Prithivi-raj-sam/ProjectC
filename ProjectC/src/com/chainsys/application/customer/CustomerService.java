package com.chainsys.application.customer;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {

	@GetMapping("/getCustomer")
	public String getCustomer() {
		return "hello customer";
	}
	@PostMapping("/addCustomer")
	public int addNewCustomer() {

		return 0;
	}
	@PutMapping("/UpdateCustomer")
	public int updateCustomer() {
		return 1;
	}
	@DeleteMapping("/deleteCustomer")
	public int deleteCustomer() {
		return 2;
	}
}
