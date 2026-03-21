package com.deposit_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deposit_service.kafka.DepositEventProducer;
import com.deposit_service.model.DepositDetails;
import com.deposit_service.repo.DepositDetailsrepo;
import com.statebank.Deposit;
import com.statebank.DepositEvent;
@Service
public class DespositService implements DepositDetailsInterface {
   @Autowired
   public DepositDetailsrepo depositDetailsrepo;
   @Autowired
   public DepositEventProducer depositEventProducer;
   @Autowired
   public DepositDetails depositDetails;
	@Override
	public DepositDetails saveDepositDetails(Deposit deposit) {
		DepositEvent depositEvent=new DepositEvent();
		depositDetails.setAccountNumber(deposit.getAccountNumber());
		depositDetails.setAccountholderName(deposit.getAccountHolderName());
		depositDetails.setDepositAmount(deposit.getDepositAmount());
		depositDetailsrepo.save(depositDetails);
		depositEvent.setAccountNumber(depositDetails.getAccountNumber());
		depositEvent.setAccountHolderName(depositDetails.getAccountholderName());
		depositEvent.setDepositAmount(depositDetails.getDepositAmount());
		depositEventProducer.sendDepositEvent(depositEvent);
	     return depositDetails;	
	}

}
