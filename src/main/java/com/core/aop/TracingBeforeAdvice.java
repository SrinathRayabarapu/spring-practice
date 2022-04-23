package com.core.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TracingBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("Hellow World by : "+getClass().getName());
	}

}
