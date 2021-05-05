package day5;

import day5.configuration.AppConfig;
import day5.configuration.JndiDataConfig;
import day5.configuration.ModelConfig;
import day5.dao.AccountDAO;
import day5.itiSource.MyPropertySource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

public class Main {
    public static void main(String[] args) {

        // you can register here or with register method
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(ModelConfig.class);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

//                AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JndiDataConfig.class);

        // Create new Bean From AccountServiceImpl
        //                new AnnotationConfigApplicationContext(AppConfig.class, AccountServiceImpl.class);

//        AccountDAO accountDAO = (AccountDAO) context.getBean("account1");
        AccountDAO accountDAO = (AccountDAO) context.getBean("accountDAO");
//        accountDAO.printMessage("Wel3a");
//
        // todo ask Why?
//        context.scan("day5");
//        context.refresh();

        /*
         * In non Web aware Application By default,
         * 1. JVM system properties
         * 2. JVM system environment
         * */

        Environment environment = context.getEnvironment();
        boolean containsProperty = environment.containsProperty("JAVA_HOME");
        //        True
        System.out.println("Does environment contain the JAVA_HOME?  " + containsProperty);

        MutablePropertySources sources = context.getEnvironment().getPropertySources();
        sources.addFirst(new MyPropertySource("myResource"));

        Environment environment2 = context.getEnvironment();
        String propertyValue = environment2.getProperty("userId");
        System.out.println("user id is " + propertyValue);

        context.close();
    }
}
