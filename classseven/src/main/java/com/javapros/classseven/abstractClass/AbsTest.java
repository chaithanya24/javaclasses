package com.javapros.classseven.abstractClass;

public class AbsTest {

	public static void main(String[] args) {
	
		
		Contractor contractor = new Contractor("mark", 1234, "Unison");
		
		Contractor contractor1 = new Contractor("mike", 9876, "Infosys");
		
		System.out.println("Name " +contractor.getName() + " Ssn " + contractor.getSsn() + 
				" Salory " +contractor.calculateSalory(40) + " VacationDays " + contractor.vacationDays() +
				" emplyerName "+contractor.getEmployerName());
		
		System.out.println("Name " +contractor1.getName() + " Ssn " + contractor1.getSsn() + 
				" Salory " +contractor1.calculateSalory(41) + " VacationDays " + contractor1.vacationDays() +
				" emplyerName "+contractor1.getEmployerName());
		
		Fulltime emp1 = new Fulltime("Murali", 4567);
		
		Fulltime emp2 = new Fulltime("Tom", 9876543);
		
		System.out.println("Name " +emp1.getName() + " Ssn " + emp1.getSsn() + 
				" Salory " +emp1.calculateSalory(40) + " VacationDays " + emp1.vacationDays() +
				" emplyerName " +Fulltime.employerName);
		
		System.out.println("Name " +emp2.getName() + " Ssn " + emp2.getSsn() + 
				" Salory " +emp2.calculateSalory(41) + " VacationDays " + emp2.vacationDays() +
				" emplyerName " +Fulltime.employerName);
		
		//Test interface access modifier.
		
		
			
	}

}
