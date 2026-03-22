package com.balancecheckservice.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.balancecheckservice.model.BalanceDetails;


public interface BalanceDetailsRepo extends JpaRepository<BalanceDetails,Long> {
  public  BalanceDetails findByAccountNumber(Long accountNumber);
}
