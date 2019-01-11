package com.javapros.classthree;

public class GiftedStudent extends Student {

	private String disability;
	

	public GiftedStudent(int id, String name, String gender, int age) {
		super(id, name, gender, age);
	}
	
	public GiftedStudent(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	void printDetails() {
		System.out.println("name of gifted student:" +getName());
	}
	
	
}
