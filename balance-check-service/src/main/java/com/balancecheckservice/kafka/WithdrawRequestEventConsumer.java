package com.balancecheckservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.balancecheckservice.service.BalanceDetailsService;

public class WithdrawRequestEventConsumer {
@Autowired
public BalanceDetailsService balanceDetailsService;

@KafkaListener(topics = "withdraw-service",groupId = "balance-check-group")
public void withdrawRequestProcess() {
	
}
}
