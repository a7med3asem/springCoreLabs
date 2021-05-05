package day5.services.impl;

import day5.dao.AccountDAO;
import day5.dao.ProductDAO;
import day5.models.Account;
import day5.models.impl.AccountImpl1;
import day5.models.impl.AccountImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import day5.services.AccountService;

import javax.annotation.Resource;
import java.util.*;

public class AccountServiceImpl implements AccountService {

    @Autowired(required = false)
    private AccountDAO accountDao;

    //    @Autowired
//    @DAOQualifier(name = "Mohamed", mobile = Mobile.Orange)
//    private Account firstAccount;

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl()\n");
    }


    /*
     * for the following
     * If there is no bean config in xml file throws this exception
     * else you must set @Autowired required attribute to false
     *
     * .NoSuchBeanDefinitionException: No qualifying bean of type 'day5.dao.AccountDAO' available:
     * expected at least 1 bean which qualifies as autowire candidate.
     *
     * */
//    @Autowired
//    public AccountServiceImpl(AccountDAO accountDAO) {
//        System.out.println("AccountServiceImpl(AccountDAO accountDAO)\n");
//        this.accountDao = accountDAO;
//    }

    @Autowired
    public void setAccountDao(AccountDAO accountDao) {
        System.out.println("setAccountDao(AccountDAO accountDao)");
        this.accountDao = accountDao;
    }

    @Autowired
    public void setup(AccountDAO accountDAO) {
        System.out.println("setup(AccountDAO accountDAO)");
        System.out.println("Object is " + accountDAO);
        this.accountDao = accountDAO;
    }




    /*
     * For the following
     * if not annotated with @Autowired firstAccount will not be instantiated
     * and setup method throws NullPointerException
     * */
//    @Autowired
//    private Account firstAccount;
//
//    @Autowired
//    public void setupWithFieldInjection(AccountDAO accountDAO) {
//        System.out.println("setupWithFieldInjection(AccountDAO accountDAO)");
//        System.out.println("Object is " + accountDAO);
//        firstAccount.print();
//        this.accountDao = accountDAO;
//    }

    /*
     * Output
     * AccountDAOImpl()
     *
     * AccountServiceImpl(AccountDAO accountDAO)
     *
     * setAccountDao(AccountDAO accountDao)
     * setup(AccountDAO accountDAO)
     * Object is AccountDAOImpl{}
     * */

    //    @Autowired
//    List<Account> accounts;
//
//    @Autowired
//    public void showSetAccounts(List<Account> accounts) {
//        System.out.println("showListAccounts()");
//
//        accounts.forEach(System.out::println);
//    }
//
//    @Autowired
////    @Order
//    public void setAccounts(List<Account> accounts) {
//        this.accounts = accounts;
//    }
//
    @Autowired
    Map<String, Account> map;

    // todo why does not throw exception???
    @Autowired
    public void setMap(Map<String, Account> map) {
        this.map = map;
    }

    @Autowired
    public void showMap(Map<String, Account> map) {
        map.forEach((s, account1) -> {
            System.out.println("Key is  " + s + " Value is " + account1);
        });
    }

    // todo------------- Use @Autowired with Optional  -------------------------------------------------------

    /*
     * Solution for @Autowired to be used even if you didn't create a bean for it
     * */

    @Autowired
    private Optional<AccountDAO> accountDAOOptional;

    @Autowired
    public AccountServiceImpl(Optional<AccountDAO> accountDAOOptional) {
        System.out.println("AccountServiceImpl(Optional<AccountDAO> accountDAOOptional)");
        this.accountDAOOptional = accountDAOOptional;
    }

    @Autowired
    public void setAccountDAOOptional(Optional<AccountDAO> accountDAOOptional) {
        System.out.println("setAccountDAOOptional(Optional<AccountDAO> accountDAOOptional)");
        this.accountDAOOptional = accountDAOOptional;
    }

    // todo------------- use @Nullable -------------------------------------------------------------

    //    why @Nullable not works
//    @Autowired(required = false)
//    public AccountServiceImpl(@Nullable AccountDAO accountDao) {
//        System.out.println("AccountServiceImpl(@Nullable AccountDAO accountDao)\n");
//        this.accountDao = accountDao;
//    }

    // todo----------------- test Interfaces Injection ---------------------------------------

    @Autowired
    ApplicationContext context;

    @Autowired
    public void testInterfacesInjection(ProductDAO productDAO) {
        context.getBean("productDao");
    }

    // todo----------------- @Bean --------------------------------------------------------------

    @Autowired
    private Account account;

    @Bean
    public Account accountFirst() {
        System.out.println("accountFirst()");
        return new AccountImpl1();
    }

    @Bean
    @Primary
    public Account accountSecond() {
        System.out.println("accountSecond()");
        return new AccountImpl2();
    }

    @Bean
    public void testPrimaryAnnotation() {
        System.out.println("testPrimaryAnnotation()");
        account.print();
    }

    /*
     * Output
     *
     * AccountServiceImpl(@Nullable AccountDAO accountDao)
     * accountSecond()
     * AccountImpl2()
     * accountFirst()
     * AccountImpl1()
     * testPrimaryAnnotation()
     * hello from AccountImpl2
     * */


    // todo ------------------- using @Qualifier  ----------------------------------
    @Autowired
    public AccountServiceImpl(@Qualifier("accountDAO2") AccountDAO accountDao) {
        System.out.println("AccountServiceImpl(@Qualifier(\"accountDAO2\") AccountDAO accountDao)\n");
        this.accountDao = accountDao;
    }

//    @Autowired
//    @Qualifier("accountDAO2")
//    public void setup(AccountDAO accountDAO) {
//        System.out.println("setup(AccountDAO accountDAO)");
//        System.out.println("Object is " + accountDAO);
////        firstAccount.print();
//        this.accountDao = accountDAO;
//    }

    // todo ---------- using @javax.annotation.Resource ---------------------------





    /*
     * .NoSuchBeanDefinitionException: No qualifying bean of type 'day5.models.Account' available:
     * expected at least 1 bean which qualifies as autowire candidate.
     * */

    @Resource
    public void testResource(Account account) {
        System.out.println("testResource(Account account)");
        account.print();
    }

    /*
     * Output
     * AccountDAOImpl()
     *
     * AccountImpl1()
     * AccountServiceImpl()
     *
     * testResource(Account account)
     * hello from AccountImpl1
     * */


    // todo----------- using @org.springframework.beans.factory.annotation.Value  ------

    @Override
    public void addAccount(Account account) {
        accountDAOOptional.get().addAccount(account);
    }


    @Override
    public void printMessage(String message) {
        this.accountDao.printMessage(message);
    }

}
