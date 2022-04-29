package com.core.configuration;

import com.core.bean.ICoach;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SpringAnnotationConfigurationMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);

        System.out.println("Annotation based component configuration");

        //this is with component scan - @Qualifier used here
        //ICoach tennisCoach = applicationContext2.getBean("tennisCoach", ICoach.class);
        //tennisCoach.doWorkOut();
        //tennisCoach.getFortune();

        //this is without component scan
        ICoach swimCoach = applicationContext.getBean("swimCoach", ICoach.class);
        swimCoach.doWorkOut();
        swimCoach.getFortune();

    }

}
