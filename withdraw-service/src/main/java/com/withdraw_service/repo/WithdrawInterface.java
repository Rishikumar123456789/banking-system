package com.withdraw_service.repo;

import com.statebank.Withdraw;
import com.withdraw_service.model.WithdrawDetails;

public interface WithdrawInterface {
public  WithdrawDetails processWithdrawRequest(Withdraw withdraw);
}
