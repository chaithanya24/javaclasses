package com.javapros.classsix;

class Parent{
	static void fun() {
		System.out.println("inside parent..");
	}
}

class Child extends Parent {
	static void fun() {
		System.out.println("inside child..");
	}
}
public class StaticTest {

	private static String name ="CHAITHANYA";
	
	public static void main(String[] args) {
		
		System.out.println(name);
		//Parent.fun();
		Parent parent= new Child();
		parent.fun();

	}

}
