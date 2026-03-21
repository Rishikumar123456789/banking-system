package com.balancecheckservice.service;

import java.util.List;
import java.util.Optional;

import com.balancecheckservice.model.BalanceDetails;
import com.statebank.AccountOpenedEvent;

public interface BalanceDetailsInterface {
   public BalanceDetails updateBalanceDetails(AccountOpenedEvent event);
   public Optional<BalanceDetails> findByAccountNumber(Long accountNumber);
   public List<BalanceDetails> findAllAccountsBalanceDetails();
   
}
