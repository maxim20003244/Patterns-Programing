package com.Singleton;

public class TestSingleton {
	
	private static TestSingleton instance;
	
	private TestSingleton () {
		
	}
	
	public static TestSingleton geTestSingleton() {
		if (instance==null) {
			instance = new TestSingleton();
		}
		return instance;
	}

	
	public void print() {
		System.out.println("hello");
	}
}
