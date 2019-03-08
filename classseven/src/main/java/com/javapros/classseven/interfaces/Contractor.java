package com.javapros.classseven.interfaces;

public class Contractor extends EmployeeBasics {
	
	public Contractor(String name, String ssn) {
		super(name, ssn);
	}

	@Override
	public int calculateSalory(int hours) {
		return hours * 45;
	}
	
	
}
