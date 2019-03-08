package com.javapros.classseven.abstractClass;

public abstract class AbsEmployee {

	private final String name;
	private final int ssn;

	public AbsEmployee(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public int getSsn() {
		return ssn;
	}

	public abstract int calculateSalory(int hours);

	public int vacationDays() {
		return 4;
	}

}
