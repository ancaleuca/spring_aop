package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		IBasic foo = (IBasic) applicationContext.getBean("foo");
		IExtra extraFoo = (IExtra) foo;
		
		foo.doSomethingWithParameter("MyParam");
		
        System.out.println("Is IBasic?: " + (foo instanceof IBasic));
        System.out.println("Is IExtra?: " + (foo instanceof IExtra));
		
        System.out.println("##### This is IBasic: ######");
		foo.doSomething();
		System.out.println("##### This is IExtra: ######");
		extraFoo.doSomethingExtra();
		
	}

}
