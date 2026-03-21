package com.withdraw_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.statebank.Withdraw;
import com.withdraw_service.model.WithdrawDetails;
import com.withdraw_service.service.WithdrawService;

@RestController
public class WithdrawController {
	@Autowired
	WithdrawService withdrawService;
   @PostMapping("wihtDrawMoney")
   public WithdrawDetails wihtDrawMoney( @RequestBody Withdraw withdraw) {
	   return withdrawService.processWithdrawRequest(withdraw);
   }
}
