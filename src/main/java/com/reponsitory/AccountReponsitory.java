package com.reponsitory;

import com.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountReponsitory extends JpaRepository<Account, String> {
}
