package day5.models.impl;

import day5.models.Account;

public class AccountImpl2 implements Account {

    public AccountImpl2() {
        System.out.println("AccountImpl2()");
    }

    @Override
    public void print() {
        System.out.println("hello from AccountImpl2");
    }
}
