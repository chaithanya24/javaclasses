package com.javapros.classseven.abstractClass;

import com.javapros.classseven.interfaces.IBenifits;

public class TestInterfaceModifier implements IBenifits{

	@Override
	public int pensionAmount() {
		// TODO Auto-generated method stub
		System.out.println(empName);
		return 0;
	}

	@Override
	public boolean isRetirementBenifitsAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

}
