package com.javapros.classtwo;

class Employee {
	
	
	public Employee() {
	}

	
	//Fields/Attributes/State/Data of Object.
	//Instance varibales.
	int id;
	int age;
	String name;
	String ssn;
	int vacationDays;
	
	
	
	//Method/Behavior.
	void printEmployeeDetails() {
		System.out.println("Id:: "+id+ " age:: "+age + " name:: "+ name + " ssn:: "+ssn);
	}
	
	
}

/**
 * 
 * @author p2799013
 *
 */
public class SampleObject {

	public static void main(String[] args) {

		//emp is on object.
		// Class is blueprint.
		// Object is an instance of class.
		// Constructor are used to get instance of an object (helps to constructor help to construct object).
		Employee emp = new Employee();
		//emp.id = 1;
		//emp.age = 29;
		//emp.name = "Chaithanya";
		//emp.ssn = "XXX-123-345";
		
		Employee emp1 = emp;
		emp.printEmployeeDetails();
		emp1.printEmployeeDetails();
		
		emp1.id = 2;
		emp1.age = 31;
		emp1.name = "Murali";
		emp1.ssn = "XXX-234-765";
		
		emp.printEmployeeDetails();
		emp1.printEmployeeDetails();
		//System.out.println("age:: " + emp.age + " name:: " +emp.name + " ssan:: " +emp.ssn);
		//System.out.println("age:: " + emp1.age + " name:: " +emp1.name + " ssan:: " +emp1.ssn);
	}

}
