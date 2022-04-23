package com.core.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class TracingAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object object, Method method, Object[] args,
			Object target) throws Throwable {
		System.out.println("Hellow World by : "+getClass().getName());
	}

}
