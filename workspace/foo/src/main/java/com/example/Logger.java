package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	
	@Pointcut("execution(* com.example.Foo.doSomething(..))")
	public void something() {
		//Dummy method!
	}
	
	@Pointcut("execution(* com.example.Foo" +
			".doSomethingWithParameter(String)) && args(parameter)")
	public void somethingWithParam(String parameter) {
		//Dummy method!
	}
	
	@Before("something()")
	public void logBefore() {
		System.out.println("Logger is logging before");
	}
	
	@After("somethingWithParam(parameter)")
	public void logAfterWithParam(String parameter) {
		System.out.println("Logger is logging this parameter: " + parameter);
	}
	
	@Around("something()")
	public void logAround(ProceedingJoinPoint joinPoint) {
		try{
			System.out.println("Logger is logging around (before)");

			joinPoint.proceed();
			joinPoint.proceed();

			System.out.println("Logger is logging around (after)");
		} catch (Throwable e) {
			System.out.println("Logger is logging an exception");
		}
	}
}
