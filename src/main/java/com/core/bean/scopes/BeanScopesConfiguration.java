package com.core.bean.scopes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.core.bean.scopes")
public class BeanScopesConfiguration {
}
