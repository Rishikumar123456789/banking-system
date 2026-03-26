package com.balancecheckservice.service;

import java.util.List;

import com.balancecheckservice.model.BalanceDetails;
import com.statebank.AccountOpenedEvent;
import com.statebank.DepositEvent;
import com.statebank.Withdraw;
import com.statebank.WithdrawStatus;

public interface BalanceDetailsInterface {
   public BalanceDetails updateBalanceDetails(AccountOpenedEvent event);
   public BalanceDetails updateBalanceDetailsfromDepositEvent(DepositEvent depositEvent);
   public BalanceDetails findByAccountNumber(Long accountNumber);
   public List<BalanceDetails> findAllAccountsBalanceDetails();
   public WithdrawStatus processWithdrawrequest(Withdraw withdraw);
   
}
