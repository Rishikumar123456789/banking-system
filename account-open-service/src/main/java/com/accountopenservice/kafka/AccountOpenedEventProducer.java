package com.accountopenservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.accountopenservice.configuration.MyKafkaTopicConfiguration;
import com.statebank.AccountOpenedEvent;
@Service
public class AccountOpenedEventProducer {
	
@Autowired
KafkaTemplate<String,AccountOpenedEvent> kafkaTemplate;

public void sendAccountOpenedEvent(AccountOpenedEvent  event) {
	kafkaTemplate.send(MyKafkaTopicConfiguration.mytopic, event);

}
}
