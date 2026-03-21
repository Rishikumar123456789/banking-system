package com.balancecheckservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balancecheckservice.model.BalanceDetails;
import com.balancecheckservice.repo.BalanceDetailsRepo;
import com.statebank.AccountOpenedEvent;
@Service
public class BalanceDetailsService implements BalanceDetailsInterface {
    @Autowired
    public BalanceDetailsRepo balanceDetailsRepo;
    @Autowired
    public BalanceDetails balanceDetails;
	@Override
	public BalanceDetails updateBalanceDetails(AccountOpenedEvent event) {
		  balanceDetails.setAccountNumber(event.getAccountNumber());
		  balanceDetails.setName(event.getName());
		  balanceDetails.setBalance(event.getBalance());
		  return balanceDetailsRepo.save(balanceDetails);
	}

	@Override
	 public Optional<BalanceDetails> findByAccountNumber(Long accountNumber){
		return  balanceDetailsRepo.findByAccountNumber(accountNumber);
	}

	@Override
	public List<BalanceDetails> findAllAccountsBalanceDetails() {
		  return balanceDetailsRepo.findAll();
	}
	


}
