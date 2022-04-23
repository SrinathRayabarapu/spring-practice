package com.core.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class NullArgumentsNotAllowedBeforeAdvice implements MethodBeforeAdvice {
	
	@Override
	public void before(Method method, Object[] arguments, Object target) throws Throwable {

		if(arguments == null || arguments.length == 0){
			return;
		}
		
		for(int i = 0; i < arguments.length; i++){
			Object argument = arguments[i];
			if(argument == null){
				throw new IllegalArgumentException
						("Value for argument ["+i+"] is required but not present for method ["+method+"] !");
			}
		}

	}

}