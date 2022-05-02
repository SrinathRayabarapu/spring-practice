package com.core.bean.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class BeanLifeCycleComponent implements IBeanLifeCycle{

    @PostConstruct
    public void init() {
        log.info("PostConstruct - init() called");
    }

    @Override
    public void someTask() {
        log.info("some task is called");
    }

    @PreDestroy
    public void destroy() {
        log.info("PreDestroy - destroy() called");
    }

}
