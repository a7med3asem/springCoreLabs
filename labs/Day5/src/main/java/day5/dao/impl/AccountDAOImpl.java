package day5.dao.impl;


import day5.dao.AccountDAO;
import day5.model.Account;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AccountDAOImpl implements AccountDAO {

    Account account;

    public AccountDAOImpl() {
        System.out.println("AccountDAOImpl()\n");
    }

    public AccountDAOImpl(Account account) {
        System.out.println("AccountDAOImpl(Account account)");
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
        System.out.println("Init method AccountDAOImpl");
    }

    @Override
    public void close() {
        System.out.println("Close method AccountDAOImpl");
    }

    @Override
    public String toString() {
        return "AccountDAOImpl{}";
    }
}
