package com.balancecheckservice.kafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.balancecheckservice.service.BalanceDetailsService;
import com.statebank.AccountOpenedEvent;

@Service
public class AccountOpenedEventConsumer {
@Autowired
public BalanceDetailsService balaceDetailsService;
@KafkaListener(topics = "account-open-topic",groupId = "balance-check-group")
public void consumeAccountOpendEvent(AccountOpenedEvent event) {
	balaceDetailsService.updateBalanceDetails(event);
}

}
