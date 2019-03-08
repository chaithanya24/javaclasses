package com.javapros.classseven.interfaces;

public class EmployeeBasics implements IEmployee, IBenifits{

	private final String name;
	private final String ssn;
	
	public EmployeeBasics(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return this.name;
	}

	public String getSsn() {
		return this.ssn;
	}

	public int calculateSalory(int hours) {
		return 0;
	}

	public int pensionAmount() {
		return 100;
	}

	public boolean isRetirementBenifitsAvailable() {
		return false;
	}

}
