package com.deposit_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deposit_service.model.DepositDetails;

public interface DepositDetailsrepo extends JpaRepository<DepositDetails,Long> {

}
