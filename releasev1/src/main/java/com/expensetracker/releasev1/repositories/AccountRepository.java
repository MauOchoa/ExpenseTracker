package com.expensetracker.releasev1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.expensetracker.releasev1.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
}
