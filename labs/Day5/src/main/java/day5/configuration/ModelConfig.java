package day5.configuration;

import day5.dao.AccountDAO;
import day5.dao.impl.AccountDAOImpl2;
import day5.services.AccountService;
import day5.services.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfig {

    public ModelConfig() {
        System.out.println("From ModelConfig Constructor");
    }

    @Bean("account2")
//    @Bean
    public AccountDAO accountDAO2() {
        System.out.println("AccountDAO from modelConfig\n");
        System.out.println("Zabady");
        return new AccountDAOImpl2();
    }


    // todo -------   method injection --------------------
    @Bean("accountService")
    public AccountService accountService(AccountDAO accountDAO) {
        System.out.println("accountService from modelConfig\n");
        return new AccountServiceImpl(accountDAO);
    }


    // todo -----  Fully qualified import  ----------------

//    @Autowired
//    AppConfig appConfig;

//    @Bean("accountService")
//    public AccountService accountService(AccountDAO accountDAO) {
//        System.out.println("accountService from modelConfig\n");
//        return new AccountServiceImpl(accountDAO);
//    }
}
