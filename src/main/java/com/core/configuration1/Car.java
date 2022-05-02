package com.core.configuration1;

import com.core.configuration.IVehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component //by default component name is "car" - first letter is small
public class Car implements IVehicle {

    @Autowired //uses the bean type by default
    @Qualifier("smallEngine") //uses the bean name
    IEngine engine;

    public Car() {
        log.info("Default constructor called");
    }

    @Override
    public void drive() {
        log.info("Car is driving with {}", engine.getEngine());
    }
}
