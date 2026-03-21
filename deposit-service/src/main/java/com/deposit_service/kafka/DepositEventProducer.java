package com.deposit_service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.deposit_service.config.MyKafkaTopicConfiguration;
import com.statebank.DepositEvent;

public class DepositEventProducer {
  @Autowired
  KafkaTemplate<String,DepositEvent> kafkaTemplate;

  public  void sendDepositEvent(DepositEvent event) {
	  kafkaTemplate.send(MyKafkaTopicConfiguration.mytopic, event);
  }
}
