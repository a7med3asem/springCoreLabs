package iti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import iti.services.Service1;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

//@Component(value = "service1")

@ManagedBean
@Named("service1")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//@Scope("prototype")
public class Service1Impl implements Service1 {

    private int age;

    @Value("testttt")
    private String name;

    private static Service1Impl serviceInstance;

    public Service1Impl() {
        System.out.println("Service1Impl()\n");
    }

    public Service1Impl(int age) {
        this.age = age;
        System.out.println("Service1Impl(" + age + ")\n");
    }

//    @Autowired
    @Inject
    public Service1Impl(@Value("test@Value") String name) {
//    public Service1Impl(String name) {
        this.name = name;
        System.out.println("Service1Impl(" + name + ")\n");
    }

    public Service1Impl(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Service1Impl(" + age + ", " + name + ")\n");
    }


    private List<String> values = new ArrayList<>();

    @Autowired
    public void setValues(@Value("#{'${listOfValues, hahaha, wow, zaki gomaa}'.split(',')}") List<String> values) {
        System.out.println("from list");
        values.forEach(System.out::println);
        this.values.addAll(values);
    }

    @Override
    public void print() {
        System.out.println("name is " + name);
        System.out.println("From service1Impl");
    }
}
