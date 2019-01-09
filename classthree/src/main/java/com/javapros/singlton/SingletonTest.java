package com.javapros.singlton;

import com.javapros.classthree.Student;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SingletonSample singletonSample = new SingletonTest();
		SingletonSample singletonSample = SingletonSample.getSinglton();
		
		SingletonSample singletonSample2 = SingletonSample.getSinglton();
		
		SingletonSample singletonSample3 = SingletonSample.getSinglton();
	
		Student student = new Student();
		//SingletonSample sample = student.singletonSample;
		
	}

}
