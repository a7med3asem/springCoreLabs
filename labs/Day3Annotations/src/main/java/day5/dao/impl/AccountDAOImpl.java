package day5.dao.impl;


import day5.dao.AccountDAO;
import day5.models.Account;

public class AccountDAOImpl implements AccountDAO {

    public AccountDAOImpl() {
        System.out.println("AccountDAOImpl()\n");
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
    public String toString() {
        return "AccountDAOImpl{}";
    }
}
