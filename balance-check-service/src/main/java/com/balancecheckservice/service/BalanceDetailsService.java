package com.balancecheckservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balancecheckservice.kafka.WithdrawProcessedEventProducer;
import com.balancecheckservice.model.BalanceDetails;
import com.balancecheckservice.repo.BalanceDetailsRepo;
import com.statebank.AccountOpenedEvent;
import com.statebank.Withdraw;
import com.statebank.WithdrawProcessedDetails;
import com.statebank.WithdrawStatus;
@Service
public class BalanceDetailsService implements BalanceDetailsInterface {
    @Autowired
    public BalanceDetailsRepo balanceDetailsRepo;
    @Autowired
    public BalanceDetails balanceDetails;
	@Autowired
	public WithdrawProcessedEventProducer withdrawProcessedEventProducer;	
	@Override
	public BalanceDetails updateBalanceDetails(AccountOpenedEvent event) {
		  balanceDetails.setAccountNumber(event.getAccountNumber());
		  balanceDetails.setName(event.getName());
		  balanceDetails.setBalance(event.getBalance());
		  return balanceDetailsRepo.save(balanceDetails);
	}

	@Override
	 public BalanceDetails findByAccountNumber(Long accountNumber){
		return  balanceDetailsRepo.findByAccountNumber(accountNumber);
	}

	@Override
	public List<BalanceDetails> findAllAccountsBalanceDetails() {
		  return balanceDetailsRepo.findAll();
	}

	@Override
	public WithdrawStatus processWithdrawrequest(Withdraw withdraw) {
		WithdrawProcessedDetails withdrawProcessedDetails=new WithdrawProcessedDetails();
	    balanceDetails=balanceDetailsRepo.findByAccountNumber(withdraw.getAccountNumber());
		balanceDetails.setBalance(balanceDetails.getBalance().subtract(withdraw.getWithDrawAmount()));;
		withdrawProcessedDetails.setAccountNumber(balanceDetails.getAccountNumber());
		withdrawProcessedDetails.setName(balanceDetails.getName());
		withdrawProcessedDetails.setWithdrawnAmount(withdraw.getWithDrawAmount());
		withdrawProcessedDetails.setRemainingBalance(balanceDetails.getBalance());
		withdrawProcessedDetails.setStatus(WithdrawStatus.SUCCESS);
		withdrawProcessedEventProducer.sendWithdrawRequestreturn(withdrawProcessedDetails);
		balanceDetailsRepo.save(balanceDetails);
		return WithdrawStatus.SUCCESS;
		  

	}
	


}
