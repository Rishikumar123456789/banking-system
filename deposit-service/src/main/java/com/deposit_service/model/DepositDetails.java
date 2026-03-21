package com.deposit_service.model;

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
@Table(name = "depositdetails")
@Entity(name = "DepositDetails")
public class DepositDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Long transactionId;
 @Column(name = "accountNumber")
 private Long accountNumber;
 @Column(name = "accountholder_name")
 private String accountholderName;
 @Column(name = "deposit_amount")
 private BigDecimal depositAmount;
 @Column(name = "dateTime")
 private LocalDateTime dateTime;
}
