package com.accountopenservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accountopenservice.model.AccountDetails;
import java.util.Optional;




public interface AccountDetailsRepo extends JpaRepository<AccountDetails,Long> {
      Optional<AccountDetails> findByAccountNumber(Long accountNumber);
   
}
