package com.example.trial.Service;

import com.example.trial.Respository.AccountRepo;
import com.example.trial.Respository.AccountRepo;
import com.example.trial.models.Account;
import com.example.trial.models.Account;
import com.example.trial.models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService extends MainService<Account> {

    AccountRepo accountRepo;


    public AccountService(AccountRepo accountRepo) {
        super.data = "Account";
        super.repo = accountRepo;
        this.accountRepo = accountRepo;
    }

    public boolean checkAccount(Integer account){
        Optional<Account> accountFound = accountRepo.findAccountByAccountNum(account);
        if(accountFound.isPresent()){
            throw new RuntimeException("Account Number Already Registered");
        }
        return false;
    }
    public Account add(Account account){
        checkAccount(account.getAccountNum());
        return super.add(account);
    }
    public Account delete(Integer id){
        return super.delete(id);
    }
    public Account edit(Integer id,Account account){
        checkAccount(account.getAccountNum());
        account.setId(id);
        return super.edit(id,account);
    }
    public Account get(Integer id){

        return super.get(id);
    }
}
