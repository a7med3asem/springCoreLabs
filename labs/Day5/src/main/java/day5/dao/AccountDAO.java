package day5.dao;

import day5.model.Account;

public interface AccountDAO {

    void printMessage(String message);

    void addAccount(Account account);

    void init();

    void close();
}
