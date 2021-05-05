package day5.services.impl;

import day5.dao.AccountDAO;
import day5.services.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDao;

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl()\n");
    }

    public AccountServiceImpl(AccountDAO accountDAO) {
        System.out.println("AccountServiceImpl(AccountDAO accountDAO)\n");
        this.accountDao = accountDAO;
    }

    @Override
    public void printMessage(String message) {
        this.accountDao.printMessage(message);
    }
}
