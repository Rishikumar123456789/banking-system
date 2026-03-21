package com.balancecheckservice.model;

import java.math.BigDecimal;

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
@Table(name="balancedetails")
@Entity(name = "BalanceDetails")
public class BalanceDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
	@Column(name="accountNumber")
    private Long accountNumber;
	@Column(name="name")
    private String name;
    @Column(name="balance")
    private BigDecimal balance;
}
