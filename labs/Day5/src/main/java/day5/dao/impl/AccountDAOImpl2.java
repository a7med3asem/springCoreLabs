package day5.dao.impl;


import day5.dao.AccountDAO;
import day5.model.Account;

public class AccountDAOImpl2 implements AccountDAO {

    public AccountDAOImpl2() {
        System.out.println("AccountDAOImpl2()\n");
    }

    @Override
    public void printMessage(String message) {
        System.out.println("Message : " + message);
    }

    @Override
    public void addAccount(Account account) {
        System.out.println("Account Added");
    }

    @Override
    public void init() {
        System.out.println("Init method AccountDAOImpl2");
    }

    @Override
    public void close() {
        System.out.println("Close method AccountDAOImpl2");
    }

    @Override
    public String toString() {
        return "AccountDAOImpl2{}";
    }
}
