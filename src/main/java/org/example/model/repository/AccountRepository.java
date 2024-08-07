package org.example.model.repository;


import org.example.model.entity.Account;

public class AccountRepository {

//     Setter Injection
    public Account getAccount(){
        Account acc =  new Account();
        acc.setId(1);
        acc.setOwnerName("Le Hoang Long");
        acc.setBalance(25.0);
        return acc;
    }

    // Constructor Injection
    public Account getAccountConst(){
        return new Account(2, "Neyu Dang iu",20.0);
    }
}