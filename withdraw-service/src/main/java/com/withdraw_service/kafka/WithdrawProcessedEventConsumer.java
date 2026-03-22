package com.withdraw_service.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.statebank.WithdrawProcessedDetails;

@Service
public class WithdrawProcessedEventConsumer {

@KafkaListener(topics = "balance-check",groupId = "withdraw-group")	
public WithdrawProcessedDetails consumewithDrawProcssedRequest(WithdrawProcessedDetails withdrawProcessedDetails) {
	return withdrawProcessedDetails;
}

}
