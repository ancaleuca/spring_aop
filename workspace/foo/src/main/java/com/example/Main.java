package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		// When next line of code runs, the proxy class for weaving in the logging aspect is created as well.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Foo foo = (Foo) applicationContext.getBean("foo");
		foo.doSomething();
	}

}
