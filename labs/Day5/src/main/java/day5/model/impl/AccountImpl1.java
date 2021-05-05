package day5.model.impl;

import day5.model.Account;
import org.springframework.stereotype.Component;

@Component("account")
public class AccountImpl1 implements Account {

    public AccountImpl1() {
        System.out.println("AccountImpl1()");
    }


    @Override
    public void print() {
        System.out.println("hello from AccountImpl1");
    }
}
