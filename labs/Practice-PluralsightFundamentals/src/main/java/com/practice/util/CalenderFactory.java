package com.practice.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalenderFactory implements FactoryBean<Calendar> {

//    private Calendar instance = new Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
