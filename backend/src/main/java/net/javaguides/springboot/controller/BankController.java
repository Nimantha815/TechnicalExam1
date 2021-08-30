package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import net.javaguides.springboot.repository.BankRepository;
import net.javaguides.springboot.model.Bank;



@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BankController {
	
	@Autowired
	private BankRepository bankRepository;
	
	//get all banks
	@GetMapping("/banks")
	public List<Bank> getAllBanks(){
		return bankRepository.findAll();
		
	}
}
