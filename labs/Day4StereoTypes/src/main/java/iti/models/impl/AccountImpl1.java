package iti.models.impl;

import iti.models.Account;

public class AccountImpl1 implements Account {

    public AccountImpl1() {
        System.out.println("AccountImpl1()");
    }


    @Override
    public void print() {
        System.out.println("hello from AccountImpl1");
    }
}
