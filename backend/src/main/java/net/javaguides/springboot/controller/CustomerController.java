package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.repository.CustomerRepository;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	//get all customers
	@GetMapping("/customers")
	public List<Customer> getAllCustomerss(){
		return customerRepository.findAll();
		
	}
}
