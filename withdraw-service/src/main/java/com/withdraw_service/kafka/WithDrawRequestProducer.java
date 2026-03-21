package com.withdraw_service.kafka;
import com.withdraw_service.config.MyKafkaTopicConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.statebank.Withdraw;


@Service
public class WithDrawRequestProducer {

   
	
  @Autowired
  KafkaTemplate<String,Withdraw> kafkaTemplate;
  
  public void requestWithDraw(Withdraw withdraw) {
	  kafkaTemplate.send(MyKafkaTopicConfiguration.mytopic,withdraw);
  }
}
