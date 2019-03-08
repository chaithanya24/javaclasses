package com.javapros.classseven.abstractClass;

public abstract class AbsBenfits {

	private final int pensionAmmount;
	
	public AbsBenfits(int pensionAmmount) {
		this.pensionAmmount = pensionAmmount;
	}

	public int getPensionAmmount() {
		return pensionAmmount;
	}
	
	public abstract boolean isRetirementBenifitsAvailable();
}
