package com.core.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Bus implements IVehicle{

    public Bus() {
        log.info("Default constructor called");
    }

    @Override
    public void drive() {
        log.info("Bus is driving");
    }
}
