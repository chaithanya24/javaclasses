package com.javapros.classseven.abstractClass;

public class BasicBenfits extends AbsBenfits {

	public BasicBenfits(int pensionAmmount) {
		super(pensionAmmount);
	}

	@Override
	public boolean isRetirementBenifitsAvailable() {
		return false;
	}

}
