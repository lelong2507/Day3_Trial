package org.example;

import org.example.model.entity.Account;
import org.example.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterDI.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        Account acc1 = accountService.getAccountBySetter();
        System.out.println(acc1);

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("constructorDI.xml");
        AccountService accountService1 =  applicationContext1.getBean("accountService", AccountService.class);

        Account acc2 =  accountService1.getAccountByConst();
        System.out.println(acc2);

    }
}