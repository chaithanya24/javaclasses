package com.javapros.classseven.abstractClass;

public class Fulltime extends AbsEmployee{

	public static String employerName = "MindTree";
	
	public Fulltime(String name, int ssn) {
		super(name, ssn);
	}

	@Override
	public int calculateSalory(int hours) {
		return hours * 100;
	}

	@Override
	public int vacationDays() {
		int defaultDays = super.vacationDays();
		return defaultDays + 10;
	}
	
}
