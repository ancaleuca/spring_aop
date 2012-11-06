package com.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	
	@Pointcut("execution(* com.example.Foo.doSomething(..))")
	public void something() {
		//Dummy method!
	}
	
	@Before("something()")
	public void logBefore() {
		System.out.println("Logger is logging before");
	}
}
