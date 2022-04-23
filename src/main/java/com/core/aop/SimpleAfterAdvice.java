package com.core.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class SimpleAfterAdvice implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("After Method : "+arg1);
	}
	
}
