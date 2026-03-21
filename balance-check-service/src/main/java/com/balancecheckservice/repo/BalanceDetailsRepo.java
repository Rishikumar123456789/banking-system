package com.balancecheckservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balancecheckservice.model.BalanceDetails;


public interface BalanceDetailsRepo extends JpaRepository<BalanceDetails,Long> {
  public  Optional<BalanceDetails> findByAccountNumber(Long accountNumber);
}
