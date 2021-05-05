package day5.configuration;

import day5.dao.AccountDAO;
import day5.dao.impl.AccountDAOImpl;
import day5.model.Account;
import day5.model.impl.AccountImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import day5.services.AccountService;
import day5.services.impl.AccountServiceImpl;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
//@Component("appConfig")
@Import(ModelConfig.class)
@ImportResource("classpath:/applicationContext.xml")
// it works without this or refresh How come?!
//@ComponentScan(basePackages = "day5")

public class AppConfig {

    /*
    * When you run app
    * 1. APPConfig Constructor
    * 2. All modelConfig Bean methods
    * 3. AppConfig Bean methods
    * */

    @Value("${test.firstName}")
    private String firstName;

    @Value("${test.lastName}")
    private String lastName;

    @Value("${test.age}")
    private int age;

    public AppConfig() {
        System.out.println("Here is AppConfig\n");
    }

    // post processing is not working if the following is commented
    @Bean(initMethod = "init", destroyMethod = "close")
//    @Bean({"account1", "myAccount", "userAccount"})
//    @Bean
    public AccountDAO accountDAO() {
        System.out.println("AccountDAO accountDAO() :: AppConfig\n");

        AccountDAO accountDAO = new AccountDAOImpl();
        // to use callback without configuration
//        accountDAO.init();
        return accountDAO;
    }

    // todo --------  dependency injection  ------------------------------------------------
//    @Bean
//    public AccountDAO accountDAO(Account account) {
//        System.out.println("AccountDAO accountDAO()");
//        return new AccountDAOImpl(account);
//    }
    @Bean
    public Account account() {
        return new AccountImpl1();
    }

    @Bean
    public AccountService accountService1() {
        System.out.println("accountService1() :: AppConfig");
        return new AccountServiceImpl(accountDAO());
    }

    @Bean
    public AccountService accountService2() {
        System.out.println("accountService2() :: AppConfig");
        return new AccountServiceImpl(accountDAO());
    }

    // todo -----------  using @Import ---------------
    @Autowired
    @Qualifier("account2")
    AccountDAO accountDAO;

    @Autowired
    @Qualifier("accountService")
    AccountService accountService;

    @Bean
    public void testImportAnnotation() {
        System.out.println("testImportAnnotation() :: AppConfig");
        accountDAO.printMessage("Hello from imported account dao :: AppConfig\n");
    }

    @Bean
    public void testImportWithInjection() {
        System.out.println("testImportWithInjection () :: AppConfig");
        accountService.printMessage("Hello from testImportWithInjection :: AppConfig\n");
    }

    @Bean
    public AccountDAO accountDAO2() {
        return new AccountDAOImpl();
    }

    // todo ----------  combining xml with annotation configuration
    @Bean
    public void testCombining() {
        System.out.println("testCombining()");
        System.out.println("firstName is " + firstName);
        System.out.println("lastName is " + lastName);
        System.out.println("Age is " + age);
    }
}
