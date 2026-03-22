package com.balancecheckservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.balancecheckservice.config.MyKafkaTopicConfiguration;
import com.balancecheckservice.service.BalanceDetailsService;
import com.statebank.WithdrawProcessedDetails;

public class WithdrawProcessedEventProducer {
@Autowired
public BalanceDetailsService balanceDetailsService;
@Autowired
KafkaTemplate<String,WithdrawProcessedDetails> kafkaTemplate;
public void sendWithdrawRequestreturn(WithdrawProcessedDetails withdrawProcessedDetails) {
	kafkaTemplate.send(MyKafkaTopicConfiguration.mytopic, withdrawProcessedDetails);
}
}
