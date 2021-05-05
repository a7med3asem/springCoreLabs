package iti.dao.impl;


import iti.dao.AccountDAO;
import iti.models.Account;
import org.springframework.stereotype.Component;

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
