package com.core.bean.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * default scope is singleton - one bean for the context
 * prototype - creates bean everytime we get from context
 */
@Slf4j
public class BeanScopesConfigurationMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScopesConfiguration.class);

        ISong bean = applicationContext.getBean(ISong.class);
        log.info("{}", bean.getSong());

        bean = applicationContext.getBean(ISong.class);
        log.info("{}", bean.getSong());

    }

}
