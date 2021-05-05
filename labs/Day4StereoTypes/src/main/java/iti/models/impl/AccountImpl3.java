package iti.models.impl;

import iti.models.Account;

public class AccountImpl3 implements Account {

    public AccountImpl3() {
        System.out.println("AccountImpl3()");
    }

    @Override
    public void print() {
        System.out.println("hello from AccountImpl3");
    }
}
