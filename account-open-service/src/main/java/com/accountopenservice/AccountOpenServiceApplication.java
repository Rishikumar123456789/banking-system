package com.accountopenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountOpenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountOpenServiceApplication.class, args);
	}

}
