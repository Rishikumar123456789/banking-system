package com.withdraw_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.withdraw_service.model.WithdrawDetails;

public interface WithdrawDetailsRepo extends JpaRepository<WithdrawDetails,Long> {

}
