package com.core.configuration1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmallEngine implements IEngine{

    public SmallEngine() {
        log.info("Default constructor called");
    }

    @Override
    public String getEngine() {
        return "Small engine";
    }
}
