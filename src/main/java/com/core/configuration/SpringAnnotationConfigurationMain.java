package com.core.configuration;

import com.core.bean.ICoach;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SpringAnnotationConfigurationMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
        log.info("Initialised annotation based component configuration");

        // get a bean based on type
        IVehicle vehicle = applicationContext.getBean(IVehicle.class);
        vehicle.drive();

        // like @Qualifier - mention bean method name when more same types are present
        ICoach coach = applicationContext.getBean("cricketCoach", ICoach.class);
        coach.doWorkOut();


        applicationContext = new AnnotationConfigApplicationContext(ComponentsConfiguration.class);
        log.info("Initialised annotation based component configuration");

        vehicle = applicationContext.getBean(IVehicle.class);
        vehicle.drive();

    }

}
