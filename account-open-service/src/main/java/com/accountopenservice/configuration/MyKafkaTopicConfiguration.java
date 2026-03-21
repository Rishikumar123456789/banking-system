package com.accountopenservice.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MyKafkaTopicConfiguration {
	
    public static final String mytopic = "account-open-topic";
    public static final int mypartitions = 6;
    public static final short myreplicas = 1;
    
    @Bean
    public NewTopic createNewTopic() {
        return TopicBuilder.name(mytopic)
                .partitions(mypartitions)
                .replicas(myreplicas)
    
                .build();}
}
