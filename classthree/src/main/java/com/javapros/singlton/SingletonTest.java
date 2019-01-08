package com.javapros.singlton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SingletonSample singletonSample = new SingletonTest();
		SingletonSample singletonSample = SingletonSample.getInstance();
		
		SingletonSample singletonSample2 = SingletonSample.getInstance();
		
		SingletonSample singletonSample3 = SingletonSample.getInstance();
	
	}

}
