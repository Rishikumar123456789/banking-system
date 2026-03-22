package com.withdraw_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statebank.Withdraw;
import com.statebank.WithdrawStatus;
import com.withdraw_service.kafka.WithDrawRequestEventProducer;
import com.withdraw_service.model.WithdrawDetails;
import com.withdraw_service.repo.WithdrawDetailsRepo;
import com.withdraw_service.repo.WithdrawInterface;
@Service
public class WithdrawService implements WithdrawInterface {
    @Autowired
    WithDrawRequestEventProducer withDrawRequestEventProducer;
    @Autowired
    WithdrawDetailsRepo withdrawDetailsRepo;
        @Override
	public WithdrawDetails processWithdrawRequest(Withdraw withdraw) {
    	  Withdraw withdraw2=new Withdraw();
    	  WithdrawDetails withdrawDetails=new WithdrawDetails();
    	  withdrawDetails.setAccountNumber(withdraw2.getAccountNumber());
    	  withdrawDetails.setAccountHolderName(withdraw2.getAccountHolderName());
    	  withdrawDetails.setDateTime(withdraw2.getWithDrawDatetime());
    	  withdrawDetails.setWithdrawAmount(withdraw2.getWithDrawAmount());
    	  withdrawDetails.setStatus(WithdrawStatus.PENDING);
    	  withdrawDetailsRepo.save(withdrawDetails);
    	  withDrawRequestEventProducer.requestWithDraw(withdraw2);
    	  return withdrawDetails;
    	  
    	  
    	  
    	  
    	           
	}

}
