package iti;

import iti.services.Service1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("day4.xml");

        context.getBean("account");
//        context.getBean("service1");

        Service1 service = context.getBean("service1", Service1.class);
        service.print();

    }
}