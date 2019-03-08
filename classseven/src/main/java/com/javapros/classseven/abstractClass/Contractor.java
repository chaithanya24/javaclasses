package com.javapros.classseven.abstractClass;

public class Contractor extends AbsEmployee{

	private final String employerName;

	public Contractor(String name, int ssn, String employerName) {
		super(name, ssn);
		this.employerName = employerName;
	}
	
	@Override
	public int calculateSalory(int hours) {
		return  hours * 45;
	}

	@Override
	public int vacationDays() {
		int defaultDays = super.vacationDays();
		return defaultDays + 4;
	}

	public String getEmployerName() {
		return employerName;
	}
	
}
