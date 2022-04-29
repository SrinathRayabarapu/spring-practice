package com.core.configuration1;

import com.core.configuration.IVehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Car implements IVehicle {

    @Autowired
    @Qualifier("smallEngine") //tell which bean to use
    IEngine engine;

    public Car() {
        log.info("Default constructor called");
    }

    @Override
    public void drive() {
        log.info("Car is driving with {}", engine.getEngine());
    }
}
