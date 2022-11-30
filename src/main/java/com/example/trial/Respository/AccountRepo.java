package com.example.trial.Respository;

import com.example.trial.models.Account;
import com.example.trial.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account,Integer> {
    Optional<Account> findAccountByAccountNum(Integer accountNum);

    @Query("Select c from Account c where c.accountNum = ?1")
    Optional<Account> findAccountByNum(Integer accountNum);
}
