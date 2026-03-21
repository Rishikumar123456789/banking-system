package com.accountopenservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountopenservice.kafka.AccountOpenedEventProducer;
import com.accountopenservice.model.AccountDetails;
import com.accountopenservice.repo.AccountDetailsRepo;
import com.statebank.AccountOpenedEvent;
import com.statebank.Details;
@Service
public class AccountDetailsService implements AccountDetailsInterface {
    @Autowired
    public AccountDetailsRepo accountDetailsRepo;
    @Autowired
    public AccountOpenedEventProducer accountOpenedEventProducer;
	@Override
	public AccountDetails saveAccountDetails(Details details) {
		    AccountDetails accountDetails=new AccountDetails(); 
		    AccountOpenedEvent accountOpenedEvent=new AccountOpenedEvent();
		    accountDetails.setName(details.getName());   
		    accountDetails.setGender(details.getGender());
		    accountDetails.setAge(details.getAge());
		    accountDetails.setAccountType(details.getAccountType());
		    accountDetails.setMinimumBalance(details.getBalance());	
		    accountDetailsRepo.save(accountDetails);
		    accountOpenedEvent.setAccountNumber(accountDetails.getAccountNumber());
		    accountOpenedEvent.setName(accountDetails.getName());
		    accountOpenedEvent.setBalance(accountDetails.getMinimumBalance());
		    accountOpenedEventProducer.sendAccountOpenedEvent(accountOpenedEvent);
		    return accountDetails;
		}

	@Override
	public Optional<AccountDetails> findByAccountNumber(Long accountNumber) {
		  return accountDetailsRepo.findByAccountNumber(accountNumber);
	}

	@Override
	public List<AccountDetails> findallAccountDetails() {
		return accountDetailsRepo.findAll();
	}

}
