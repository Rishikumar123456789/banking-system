package com.deposit_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deposit_service.model.DepositDetails;
import com.deposit_service.service.DespositService;
import com.statebank.Deposit;
@RestController
public class DepositController {
   @Autowired
   public DespositService  despositService;
   @PostMapping("/depositAmount")
   public DepositDetails depositAmount( @RequestBody Deposit deposit) {
	   return despositService.saveDepositDetails(deposit);
   }
}
