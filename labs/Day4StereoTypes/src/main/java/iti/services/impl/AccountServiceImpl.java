package iti.services.impl;

import iti.dao.AccountDAO;
import iti.models.Account;
import iti.models.impl.AccountImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import iti.services.AccountService;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.ManagedBean;
import javax.inject.Named;

//@RestController -- > expose restful api spring remoting


//@Service(value = "accountt")  // different value
//BeanDefinitionStoreException:  nested exception is java.lang.IllegalStateException:
// Stereotype annotations suggest inconsistent component names: 'account' versus 'accountt'
//@Controller(value = "account") --> MVC controller
//@Component(value = "account") // each others extends from it
//@Lazy  // not valuable if you config scope
//@Scope("prototype")
//@Repository(value="account")
@ManagedBean
@Named("account")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDao;


//    @Autowired
//    public AccountServiceImpl() {
//        System.out.println("AccountServiceImpl()\n");
//    }

    @Autowired
    public AccountServiceImpl(@Qualifier("accountDAO2") AccountDAO accountDao) {
        System.out.println("AccountServiceImpl(AccountDAO accountDao)\n");
        this.accountDao = accountDao;
    }

    @Bean
    public Account getAccount() {
        return new AccountImpl2();
    }
}


