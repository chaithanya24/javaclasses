package com.javapros.classthree;

public class Student {
	
	private int id;
	String name;
	private String gender;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String gender, int age) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	private void printSudentDetails() {
		System.out.println("printing student details, for name:: "+name);
	}
}
