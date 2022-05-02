package com.core.bean.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeCycleMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        IBeanLifeCycle beanLifeCycle = applicationContext.getBean(IBeanLifeCycle.class);

        beanLifeCycle.someTask();

        // by default destroy() method will not be called
        // to call it, we need to close the context
        applicationContext.close();
    }

}
