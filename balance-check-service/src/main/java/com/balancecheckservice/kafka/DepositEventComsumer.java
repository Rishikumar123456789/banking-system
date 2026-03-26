package com.balancecheckservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.balancecheckservice.service.BalanceDetailsService;
import com.statebank.DepositEvent;

@Service
public class DepositEventComsumer {
@Autowired
public BalanceDetailsService balanceDetailsService;
	
@KafkaListener(topics = "deposit",groupId = "balance-check-group")
public DepositEvent consumeDepositEvent(DepositEvent depositEvent) {
	return depositEvent;
}
}
