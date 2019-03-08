package com.javapros.classseven.interfaces;

public interface IBenifits {

	static final String empName = "Charter";
	
	int pensionAmount();
	
	boolean isRetirementBenifitsAvailable();
	
	default int vacationDays() {
		return 5;
	}
	
	static void insideBenifits() {
		System.out.println("inside benifits..");
	}
	
}
