package org.example.service;

import org.example.model.entity.Account;
import org.example.model.repository.AccountRepository;

public class AccountService {
    private AccountRepository accountRepository;

    // Constructor Injection
    public AccountService(AccountRepository accountRepository){
        this.accountRepository =  accountRepository;
    }

    public AccountService(){

    }
    // Setter Injection
    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public Account getAccountBySetter(){
        return accountRepository.getAccount();
    }

    public Account getAccountByConst(){
        return accountRepository.getAccountConst();
    }
}