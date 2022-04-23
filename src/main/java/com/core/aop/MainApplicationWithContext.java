package com.core.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplicationWithContext {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IBusinessLogic businessLogic =  (IBusinessLogic)context.getBean("businessLogicBean");
		businessLogic.foo();
	}
}
