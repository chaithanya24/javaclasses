package com.javapros.singlton;

public class SingletonSample {

	private static String dbConnection;

	//Constructor.
	private SingletonSample() {
	}
	
	private static SingletonSample INSTANCE = null;
	
	
	public static SingletonSample getInstance() {
		
		if(INSTANCE == null) {
			dbConnection = "SOme DB connection";
			System.out.println("Inside singlton..");
			INSTANCE = new SingletonSample();
			
			return INSTANCE;
			
		} else {
			return INSTANCE;
		}
	}
	
	
	
	
}
