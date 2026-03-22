package com.withdraw_service.service;

import com.statebank.Withdraw;
import com.withdraw_service.model.WithdrawDetails;


public interface WithdrawInterface {
	public WithdrawDetails processWithdrawRequest(Withdraw withdraw);
}
