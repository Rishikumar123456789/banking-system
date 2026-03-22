package com.withdraw_service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.statebank.Withdraw;
import com.withdraw_service.config.MyKafkaTopicConfiguration;

public class WithDrawRequestEventProducer {
  @Autowired
  KafkaTemplate<String,Withdraw> kafkaTemplate;
  public void requestWithDraw(Withdraw withdraw) {
	  kafkaTemplate.send(MyKafkaTopicConfiguration.mytopic, withdraw);
  }
}
