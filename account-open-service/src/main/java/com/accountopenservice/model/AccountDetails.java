package com.accountopenservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "account_details")
@Entity(name="AccountDetails")
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private Integer age;
	@Column(name="account_Type")
	private String accountType;
	@Column(name="minimum_Balance")
	private BigDecimal minimumBalance;
	@Column(name = "transaction date")
	private LocalDateTime createdAt;
}
