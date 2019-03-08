package com.javapros.classseven.interfaces;

public class InterfaceTest {

	public static void main(String[] args) {
		
		FullTime mark = new FullTime("mark", "1234");
		System.out.println("name:" + mark.getName()+ " ssn::" +mark.getSsn()+ 
				" salory::" +mark.calculateSalory(40)+ " pensionAmount::" + mark.pensionAmount()
				  + " retireentBenifitsAvailable::" + mark.isRetirementBenifitsAvailable() +
				  " Vacationdays::" +mark.vacationDays());
		
		Contractor james = new Contractor("James", "34567");
		System.out.println("name:" + james.getName()+ " ssn::" +james.getSsn()+ 
				" salory::" +james.calculateSalory(40)+ " pensionAmount::" + james.pensionAmount()
				  + " retireentBenifitsAvailable::" + james.isRetirementBenifitsAvailable()
				  + " Vacationdays::" +james.vacationDays());
			
	}

}
