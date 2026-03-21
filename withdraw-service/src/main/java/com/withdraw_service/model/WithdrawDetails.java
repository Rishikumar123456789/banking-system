package com.withdraw_service.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.statebank.WithdrawStatus;

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
@Table(name="withdrawdetails")
@Entity(name = "WithdrawDetails")
public class WithdrawDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;
	@Column(name = "account_number")
	private Long accountNumber;
	@Column(name = "accountholder_name")
	private String accountHolderName;
	@Column(name = "withdraw_amount")
	private BigDecimal withdrawAmount;
	@Column(name = "Date_time")
	private LocalDateTime dateTime;
	@Column(name = "status")
	private WithdrawStatus status;
	}
