package iti.dao.impl;


import iti.dao.AccountDAO;
import iti.models.Account;
import org.springframework.stereotype.Component;

@Component(value = "accountDAO2")
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
    public String toString() {
        return "AccountDAOImpl2{}";
    }
}
