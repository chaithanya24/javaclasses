package com.javapros.classseven.interfaces;

public class FullTime extends EmployeeBasics{
	
	
	public FullTime(String name, String ssn) {
		super(name, ssn);
	}

	@Override
	public int calculateSalory(int hours) {	
		return hours * 40;
	}
	
	
	@Override
	public int pensionAmount() {
		return super.pensionAmount() + 10000;
	}

	@Override
	public boolean isRetirementBenifitsAvailable() {
		return true;
	}

	
	@Override
	public int vacationDays() {
		// TODO Auto-generated method stub
		return super.vacationDays() + 10;
	}

	public void printDetails() {	
		System.out.println("name::"+ getName() + "ssn::"+getSsn());
	}
	
	
}
