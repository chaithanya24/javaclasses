package com.javapros.classfour;

class Parent {

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("class name:" +getClass().getSimpleName());
	}
}

class Child extends Parent {

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

public class ClassNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Parent();
		Child child = new Child();
		
	}

}
