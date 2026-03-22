package com.balancecheckservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.balancecheckservice.model.BalanceDetails;
import com.balancecheckservice.service.BalanceDetailsService;

@RestController
public class BalanceDetailController {
@Autowired
public BalanceDetailsService balanceDetailsService;
@GetMapping("/getBalanceDetails/{accountNumber}")
public BalanceDetails getBalanceDetailsByAccountNumber(@PathVariable Long accountNumber) {
	return balanceDetailsService.findByAccountNumber(accountNumber);
}

@GetMapping("/getAllAccountsDetails")
public List<BalanceDetails> getBalanceDetailsByAccountNumber() {
	return balanceDetailsService.findAllAccountsBalanceDetails();
}
}
