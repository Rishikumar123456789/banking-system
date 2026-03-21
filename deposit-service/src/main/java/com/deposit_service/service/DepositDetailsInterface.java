package com.deposit_service.service;

import com.deposit_service.model.DepositDetails;
import com.statebank.Deposit;

public interface DepositDetailsInterface {
  public DepositDetails saveDepositDetails(Deposit deposit);
}
