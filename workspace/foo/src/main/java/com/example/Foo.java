package com.example;

public class Foo implements IBasic {
	
	public void doSomething() {
		System.out.println("Foo is doing something");
	}
	
	public void doSomethingWithParameter(String param) {
		System.out.println("Foo is doing something with " + param);
	}
}
