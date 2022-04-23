package com.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloWorldApp {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(HelloWorld.class);

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext
//				("SpringBeans.xml");
//		HelloWorld helloWorld =  (HelloWorld) applicationContext.getBean("helloWorld");
//		logger.info("Printing : "+helloWorld);

		BeanFactory factory = new XmlBeanFactory(new 
				FileSystemResource("src/SpringBeans.xml"));
		HelloWorld world = (HelloWorld)factory.getBean("helloWorld");
		logger.info(world.toString());
	}
}