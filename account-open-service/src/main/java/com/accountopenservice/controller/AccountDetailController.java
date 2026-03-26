package com.accountopenservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accountopenservice.model.AccountDetails;
import com.accountopenservice.service.AccountDetailsService;
import com.statebank.Details;
@RestController
public class AccountDetailController {
    @Autowired
    public AccountDetailsService accountDetailsService;
	@PostMapping("/saveAccountDetails")
	public AccountDetails saveAccountDetails( @RequestBody Details details) {
		 return accountDetailsService.saveAccountDetails(details);
		    
	}

	@GetMapping("/findByAccountNumber/{accountNumber}")
	public Optional<AccountDetails> findByAccountNumber( @PathVariable Long accountNumber) {
		  return accountDetailsService.findByAccountNumber(accountNumber);
	}

	@GetMapping("/findallAccountDetails")
	public List<AccountDetails> findallAccountDetails() {
		return accountDetailsService.findallAccountDetails();

	}
}
