package com.javapros.classthree;

public class GiftedStudent extends Student {

	private String disability;
	
	public GiftedStudent() {
		// TODO Auto-generated constructor stub
	}

	public GiftedStudent(String disability) {
		this.disability = disability;
	}

	public GiftedStudent(int id, String name, String gender, int age) {
		super(id, name, gender, age);
	}
	
	void printDetails() {
		System.out.println("name of gifted student:" +name);
	}
	
	
}
