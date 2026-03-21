package com.accountopenservice.service;

import java.util.List;
import java.util.Optional;

import com.accountopenservice.model.AccountDetails;
import com.statebank.Details;

public interface AccountDetailsInterface {
   public AccountDetails saveAccountDetails(Details details);
   public Optional<AccountDetails> findByAccountNumber(Long accountNumber);
   public List<AccountDetails> findallAccountDetails();
}
