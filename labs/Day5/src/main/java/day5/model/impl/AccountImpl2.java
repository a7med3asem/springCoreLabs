package day5.model.impl;

import day5.model.Account;

public class AccountImpl2 implements Account {

    public AccountImpl2() {
        System.out.println("AccountImpl2()");
    }

    @Override
    public void print() {
        System.out.println("hello from AccountImpl2");
    }
}
