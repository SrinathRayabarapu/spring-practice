package com.core.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplicationAOP {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMtBean bean = (IMtBean) context.getBean("afterBean");
        bean.showValues();
    }
}
